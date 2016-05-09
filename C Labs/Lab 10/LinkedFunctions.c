/*Adam Jacoby
 *
 *
 */
 #include "proto.h"
 #include<stdio.h>
 

/* insert class */
void insert(class_list_t *listp, int id, int classId, int section, int credits)
{
	++(listp->size);
	listp->headp = class_in_order(listp->headp, id, classId, section, credits)
}

/* Add a class in order */
class_node_t *
class_in_order(class_node_t *old_listp, int new_id, int new_classId, int new_section, int new_credits)
{
	class_node_t *new_listp;
	if(old_listp == NULL)
	{
		new_listp = (class_node_t *)malloc(sizeof(class_node_t));
		new_listp->id = new_id;
		new_listp->classId = new_classId;
		new_listp->section = new_section;
		new_listp->credits = new_credits;
		new_listp->nextp = NULL;
	}
	else if(old_listp->id >= new_id)
	{
		if(old_listp->classId < new_classId)
		{
			new_listp = old_listp;
			new_listp->nextp = class_in_order(old_listp->nextp, new_id, new_classId, new_section, new_credits);
		}
		else{
			new_listp = (class_node_t *)malloc(sizeof(class_node_t));
			new_listp->id = new_id;
			new_listp->classId = new_classId;
			new_listp->section = new_section;
			new_listp->credits = new_credits;
			new_listp->nextp = old_listp;
		}
	}
	else
	{
		new_listp = old_listp;
		new_listp->nextp = class_in_order(old_listp->nextp, new_id, new_classId, new_section, new_credits);
	}
	return(new_listp)
}

/* deletes class class node */

int delete(class_list_t *listp, int target)
{
	int is_deleted;
	listp->headp = delete_ordered_node(listp->headp, target, &is_deleted);
	if(is_deleted)
		--(listp->size);
	return(is_deleted);
}

/* delete from ordered list */
class_node_t *
delete_ordered_node(class_list_t *listp, int target, int *is_deletedp)
{
	class_node_t *to_freep, *ansp;
	
	/*cant find target*/
	if(listp == NULL)
	{
		*is_deletedp = 0;
		ansp = NULL;
	}
	/*target is first node*/
	else if(listp->classId == target)
	{
		*is_deletedp = 1;
		to_freep = listp;
		ansp = listp->nextp;
		free(to_freep);
	}
	/* if past the target in ordered list, quit*/
	else if(listp->classId > target)
	{
		*is_deletedp = 0;
		ansp = listp;
	}
	/* modify and return list */
	else
	{
		ansp = listp;
		ansp->nextp = delete_ordered_node(listp->nextp, target, is_deletedp);
	}
	return (ansp);
}