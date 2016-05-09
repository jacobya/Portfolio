#Makefile
lab7: lab7.o getAnswers.o 
	gcc -o lab7 lab7.o getAnswers.o
lab7.o: lab7.c proto.h
	gcc -c -lm lab7.c
get_answers.o: getAnswers.c proto.h
	gcc -c getAnswers
clean:
	rm *.o lab7