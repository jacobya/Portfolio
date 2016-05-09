#lang scheme
(define (intersect lst1 lst2)
	(if(null? lst1) ;check if lst1 is empty
		'()
		(if(member? (car lst1) lst2)
		(cons (car lst1)(intersect (cdr lst1) lst2));add first element to list, recurse
		(intersect (cdr lst1) lst2)))) ;recurse
		
(define (union lst1 lst2)
	(if (null? lst1) ;if lst1 is empty return lst2
		lst2
		(if(member? (car lst1) lst2) ;check if first element is in lst2
		(union (cdr lst1) lst2) ;recurse
		(cons (car lst1)(union (cdr lst1) lst2))))) ;add first element to list, recurse
(
define (set? lst)
	(if (null? lst) ;check if empty
		#t
		(if(member? (car lst) (cdr lst))
			#f
			(set? (cdr lst))))) ;recur

(define (member? e lst)
	(if (null? lst) ;check if empty
		#f
		(if(eq? e(car lst)) ;check first element
			#t
			(member? e (cdr lst))))) ;recur
