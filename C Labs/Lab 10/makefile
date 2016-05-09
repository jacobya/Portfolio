#Makefile
lab7: lab10.o LinkedFunctions.o
	gcc -o lab10 lab10.o LinkedFunctions.o
lab7.o: lab10.c proto.h
	gcc -c lab10.c
LinkedFunctions.o: LinkedFunctions.c proto.h
	gcc -c LinkedFunctions.c
clean:
	rm *.o lab10