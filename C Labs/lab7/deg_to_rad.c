/*Adam Jacoby
 *converts from degrees to radian
 *
 */
 #include "proto.h"
 
 double deg_to_rad(double degrees)
 {
	double radian;
	radian = (PI * degrees) / 180.00;
	return radian;
 }