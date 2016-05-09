# Adam Jacoby
# Python Project 2

__author__ = 'Adam Jacoby'

from random import randint
import operator

class Element:
    name = " "
    def __init__(self):
        self.data = []
    def getname(self):
        return self.name
    def compareTo(Element):
        raise NotImplementedError("Not yet implemented")

class Rock(Element):
    name = "rock"
    def __init__(self, name):
        self.name = "rock"
    def compareTo(self, enemy):
        if enemy == "rock":
            print("Rock equals Rock")
            return "Tie"
        elif enemy == "paper":
            print("Paper covers Rock")
            return "Lose"
        elif enemy == "scissors":
            print("Rock crushes Scissors")
            return "Win"
        elif enemy == "lizard":
            print("Rock crushes Lizard")
            return "Win"
        else:
            print("Spock vaporizes Rock")
            return "Lose"

class Paper(Element):
    name = "paper"
    def __init__(self, name):
        self.name = "paper"
    def compareTo(self, enemy):
        if enemy == "paper":
            print("Paper equals Paper")
            return "Tie"
        elif enemy == "rock":
            print("Paper covers Rock")
            return "Win"
        elif enemy == "scissors":
            print("Scissors cut Paper")
            return "Lose"
        elif enemy == "lizard":
            print("Lizard eats Paper")
            return "Lose"
        else:
            print("Paper disproves Spock")
            return "Win"

class Scissors(Element):
    name = "scissors"
    def __init__(self, name):
        self.name = "scissors"
    def compareTo(self, enemy):
        if enemy == "rock":
            print("Rock crushes Scissors")
            return "Lose"
        elif enemy == "paper":
            print("Scissors cut Paper")
            return "Win"
        elif enemy == "scissors":
            print("Scissors equal Scissors")
            return "Tie"
        elif enemy == "lizard":
            print("Scissors decapitate Lizard")
            return "Win"
        else:
            print("Spock smashes Scissors")
            return "Lose"

class Lizard(Element):
    name = "lizard"
    def __init__(self, name):
        self.name = "lizard"
    def compareTo(self, enemy):
        if enemy == "rock":
            print("Rock crushes Lizard")
            return "Lose"
        elif enemy == "paper":
            print("Lizard eats Paper")
            return "Win"
        elif enemy == "scissors":
            print("Scissors decapitate Lizard")
            return "Lose"
        elif enemy == "lizard":
            print("Rock crushes Lizard.")
            return "Tie"
        else:
            print("Lizard poisons Spock")
            return "Win"

class Spock(Element):
    name = "spock"
    def __init__(self, name):
        self.name = "spock"
    def compareTo(self, enemy):
        if enemy == "rock":
            print("Spock vaporizes Rock")
            return "Win"
        elif enemy == "paper":
            print("Paper disproves Spock")
            return "Lose"
        elif enemy == "scissors":
            print("Spock smashes Scissors")
            return "Win"
        elif enemy == "lizard":
            print("Lizard poisons Spock")
            return "Lose"
        else:
            print("Spock equals Spock")
            return "Tie"

rock = Rock('rock')
paper = Paper('paper')
scissors = Scissors('scissors')
lizard = Lizard('lizard')
spock = Spock('spock')
moves = [rock, paper, scissors, spock, lizard]

# rock = Rock("Rock")
# paper = Paper("Paper")
# print rock.compareTo(paper)
# print paper.compareTo(rock)
# print rock.compareTo(rock)

class player:
    def __init__(self):
        self.name = " "
    def getname(self):
        return self.name
    def play(self):
        raise NotImplementedError("Not yet Implemented")

class StupidBot(player):
    def __init__(self, name):
        self.name = "Stupid Bot"
    def play(self):
        return moves[1]

class RandomBot(player):
    def __init__(self, name):
        self.name = "Random Bot"
    def play(self):
        return moves[randint(0,4)]

class IterativeBot(player):
    def __init__(self, name, count):
        self.name = "Iterative bot"
        self.count = count
    def play(self):
        if self.count > 5:
            self.count = 0
        else:
            self.count+=1
        return moves[self.count]

class LastPlayBot(player):
    def __init__(self, name, lastPlay):
        self.name = "LastPlay bot"
        self.lastPlay = 1
    def play(self):
        return moves[self.lastPlay]

class Human(player):
    def __init__(self, name):
        self.name = "Human"
    def play(self):
        while(True):
            print("\n(1) : Rock\n(2) : Paper\n(3) : Scissors\n(4) : Spock\n(5) : Lizard\n")
            choice = int(input("Enter your move: "))
            if operator.gt(choice,0) & operator.lt(choice,6):
                break
            else:
                choice = input("Enter your move: ")
        choice-=1
        return moves[choice]

class BestBot(player):
    def __init__(self, name, lastPlay):
        self.name = "Best bot"
        self.lastPlay = 3
    def play(self):
        if self.lastPlay > 0:
            return moves[self.lastPlay-1]
        else:
            return moves[self.lastPlay+2]


stupid = StupidBot("Stupid")
iterate = IterativeBot("Iterate", 0)
random = RandomBot("Random")
last = LastPlayBot("LastPlay", 1)
best = BestBot("Best", 2)
human = Human("Humie")
players = [human, stupid, random, iterate, last, best]

class main():

    print("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by ")
    print(__author__)
    print(".\n\n")

    while(True):
        print("Please choose two players:\n\t(1) Human\n\t(2) StupidBot\n\t(3) RandomBot\n\t(4) IterativeBot")
        print("\t(5) LastPlayBot\n\t(6) BestBot\n")
        choice1 = int(input("\nSelect Player 1: "))
        if(operator.lt(choice1,7) & operator.gt(choice1,0)):
            break
        else:
            choice1 = int(input("\nTry Again: "))
    while(True):
        choice2 = int(input("\nSelect Player 2: "))
        if(operator.lt(choice2,7) & operator.gt(choice2,0)):
            break
        else:
            choice2 = int(input("\nTry Again: "))

    print("\n"+players[choice1-1].getname()+" vs "+players[choice2-1].getname()+"!\n")

    score1 = 0
    score2 = 0

    player1 = players[choice1-1]
    player2 = players[choice2-1]

    for i in range(0,5):
        print ("Round "+str(i)+", Start!")
        if choice1 == 6:
            move2 = player2.play()
            player1.lastPlay = moves.index(move2)
            move1 = player1.play()
        elif choice2 == 6:
            move1 = player1.play()
            player2.lastPlay = moves.index(move1)
            move2 = player2.play()
        else:
            move1 = player1.play()
            move2 = player2.play()

        print("Player 1 chose" + str(move1.getname())+"!\n")
        print("Player 2 chose" + str(move2.getname())+"!\n")
        result = move1.compareTo(move2.getname())

        if choice1 == 5:
            player1.lastPlay = moves.index(move2)
        if choice2 == 5:
            player2.lastPlay = moves.index(move1)

        if result == "Win":
            print("Player 1 wins the round!\n")
            score1+=1
        elif result == "Lose":
            print("Player 2 wins the round!\n")
            score2+=1
        else:
            print("The round was a tie...\n")

    print ("The score is "+str(score1)+" to "+str(score2)+".")

    if operator.gt(score1, score2):
        print(player1.getname() + "wins!")
    elif operator.lt(score1, score2):
        print(player2.getname() + "wins!")
    else:
        print("Tie Game.")



