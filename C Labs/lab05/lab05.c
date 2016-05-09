/*
 *Adam Jacoby
 *06/04/2013
 *CSCI112 Lab05
 *Calculator Problem
 */
 #include <stdio.h>
 #include <math.h>
 
 int scan_data(char, double, double);
 double do_next_op(char, double, double);
 
 int main(void)
 {
	
	char op;
	double nop;
	
	printf("Enter first operator then operand with space in between: \n");
	scanf("%c %lf", &op, &nop);
	scan_data(op, nop, 0);
}

int scan_data(char ops, double nops, double ans)
{
	if(ops != 'q')
	{
		ans = do_next_op(ops, nops, ans);
		scanf(" %c %lf", &ops, &nops);
		scan_data(ops, nops, ans);
	}
	else
		printf("final result is %3.1lf\n", ans);
	
}

double do_next_op(char op, double nop, double ans)
{
	switch(op)
	{
		case '+': 
			ans+=nop;
			printf("result so far is %.1lf\n", ans);
			return(ans);
			break;
		case '-':
			ans = ans - nop;
			printf("result so far is %.1lf\n", ans);
			return(ans);
			break;
		case '*':
			ans = ans * nop;
			printf("result so far is %.1lf\n", ans);
			return(ans);
			break;
		case '/':
			ans = ans / nop;
			printf("result so far is %.1lf\n", ans);
			return(ans);
			break;
		case '^':
			ans = pow(ans, nop);
			printf("result so far is %.1lf\n", ans);
			return(ans);
			break;
		default:
			printf("Operator is invalid\n");
			return(0);
	}
}

scanf("%d %d %d %d %d %d %d %d %d %d %d %d", 
	bar[0], bar[1], bar[2], bar[3], bar[4], bar[5], bar[6], bar[7], bar[8], bar[9], bar[10], bar[11]);