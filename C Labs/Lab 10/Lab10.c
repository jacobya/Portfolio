/*Adam Jacoby
 *Main function
 *Input
 */
  #include "proto.h"
  #include<stdio.h>
  #include<stdlib.h>
 /* class node */
 typedef struct class_node
 {
	int id;
	int classId;
	int section;
	int credits;
	struct student *nextp;
}class_node_t;

/* class list */
typedef struct class_list
{
	class_node_t *headp;
	int size;
}class_list_t;

int main(void)
{
	int next_class;
	struct class_list_t the_list = (NULL, 0); /* init linkedlist */
	
	FILE *inp, *outp;
	inp = fopen(Lab10InputData, "r");
	outp = fopen(Lab10OutputReport, "w");
	
	int num_students, num_class, num_mod, student_id, class_id, class_sec, credits; /* init */
	fscanf(inp, "%1d/n", num_students)
	struct class_list_t *student_arr[num_students]; /* init arr */
	
	fscanf(inp, "/n");
	fscanf(inp, "%1d/n", num_class);
	
	/* array of student ids? */
	
	/* array of student class linkedlists */
	for(int i; i < num_students, i++)
	{
		fscanf(inp, "%4d CS%3d %1d %1d/n", student_id, class_id, class_sec, credits);
		insert(student_arr[i], student_id, class_id, class_sec, credits);
	)
	
	qsort(student_arr, num_students, sizeof(student_arr[0]), compare_id);
}

int compare_id(const void * a, const void * b)
{
	return ( *(int*)a - *(int*)b );
}

	



