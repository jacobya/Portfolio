#lang scheme
(define (f lst)
	; (a) ;
	(if (null? lst)
		; (b) ;
		'()
		; (c) ;
		(cons (+ 1 (car lst)) (f (cdr lst)))))