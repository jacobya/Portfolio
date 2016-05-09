#Makefile
lab7: lab7.o get_problem.o deg_to_rad.o evaluate_sin.o evaluate_cos.o evaluate_tan.o
	gcc -o lab7 -lm lab7.o get_problem.o deg_to_rad.o evaluate_sin.o evaluate_cos.o evaluate_tan.o
lab7.o: lab7.c proto.h
	gcc -c -lm lab7.c
get_problem.o: get_problem.c proto.h
	gcc -c -lm get_problem.c
deg_to_rad.o: deg_to_rad.c proto.h
	gcc -c -lm deg_to_rad.c
evaluate_sin.o: evaluate_sin.c proto.h
	gcc -c -lm evaluate_sin.c
evaluate_cos.o: evaluate_cos.c proto.h
	gcc -c -lm evaluate_cos.c
evaluate_tan.o: evaluate_tan.c proto.h
	gcc -c -lm evaluate_tan.c
clean:
	rm *.o lab7