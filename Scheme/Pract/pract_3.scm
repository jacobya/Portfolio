#lang scheme
(define (set? lst)
	(if (null? lst)
		#t
		(if(member? (car lst) (cdr lst))
			#f
			(set? (cdr lst)))))
(define (member? e lst)
	(if (null? lst)
		#f
		(if(eq? e(car lst))
			#t
			(member? e (cdr lst)))))