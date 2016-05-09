######################################### 		
#										
#  Adam Jacoby			
#  majacoby8202@gmail.com
#										
#########################################


my $name = "Adam Jacoby";
print "Simpler PERL project.\n\n";

# Checks for the argument, fail if none given
if($#ARGV != 0) {
    print STDERR "You must specify the file name as the argument.\n";
    exit 4;
}

# Opens the file and assign it to handle INFILE
open(INFILE, $ARGV[0]) or die "Cannot open $ARGV[0]: $!.\n";

my $title;
my $bg = ();
my $count = 0;
# This loops through each line of the file
while($line = <INFILE>) {

	$line =~ s/(?:.*>)(?=.*?$)//; #Strip all but the title
	$line =~ s/(?:[\(\{\[\\\/\_\-\:\"\`\+\=\*].*$)//; #Remove all brackets and similar, as well as everything after
	$line =~ s/(?:(feat.).*$)//; #Remove "feat." and everything after it
	$line =~ s/[^a-zA-Z0-9 ']//g; #Strip punctuation except apostrophe
	$title = lc $line;
	
	bg_add($bg, $title); # add title to Bi-gram
	$count++; 
}

# Close the file handle
close INFILE; 

print "File parsed. Bigram model built.\n\n";
print "Title count is " . $count . "\n";

# User control loop
print "Enter a word [Enter 'q' to quit]: ";
$input = <STDIN>;
chomp($input);
print "\n";	
while ($input ne "q"){
	my ($mcw, $count, $unique) = mcw($input);
	print "Most common word after $input was: " . $mcw . " $count times. \n";
	print "Total unique: " . $unique . "\n";
	print "Generating song title: " . gen_title($input) . ".\n";
	print "Enter a word [Enter 'q' to quit]: ";
	$input = <STDIN>;
	chomp($input);
}

sub bg_add{
	my ($bg, $title, $unique) = @_;
	@word = split(' ', $title);
	#create list of stopwords to filter out
	@stopwords = ("a", "an", "and", "by", "for", "from", "in", "of", "on", "or", "out", "the", "to", "with");
	my %params = map {$_ => 1 } @stopwords;
	my $i;
	for $i(0 .. $#word){
		my $part = $word[$i];
		if($i < $#word){
			#filter out the stopwords
			if(!exists($params{$word[$i+1]})){
				#count current word
				$bg{$part}{$word[$i+1]}++;
				}
			}
		}

}

#retrieve the most common word that follows the given word
#also tracks the number of unique words that follow
sub mcw {
	my $unique = 0;
	my ($word) = @_;
	my $top, $mcom = -1;
	if (exists $bg{$word}){
		foreach my $key (keys $bg{$word}) {
			my $count = $bg{$word}{$key};
			$unique++;
			if ($count > $mcom) {
				$mcom = $count;
				$top = $key;
			} 
		}
	} else {
		$top = "";
	}
	return $top, $mcom, $unique;
}

#generate a title using the most common following words
#if a word repeats, stop the title generation
sub gen_title {
	my($word) = @_;
	my $i, $title = $word, $mcword = $word;
	for ($i = 0; $i < 9; $i++) { 
		($mcword, $_) = mcw($mcword);
		if (index($title, $mcword) == -1){
			if ($mcword) {
				$title = $title . " " . $mcword;
			} else {
				break;
			}
		}
		else {
			break;
		}
	}
	
	return $title;
}