/*Adam Jacoby
 *proto.h
 *
 */
#ifndef _PROTO_H
#define _PROTO_H
void insert(class_list_t, int, int, int, int)
class_node_t *class_in_order(class_node_t, int, int, int, int)
int delete(class_list_t, int)
class_node_t *delete_ordered_node(class_list_t, int, int)
int compare_id()
#endif