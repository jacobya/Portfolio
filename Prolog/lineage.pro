%Adam Jacoby

mother(M,C):-parent(M,C), female(M).
father(F,C):-parent(F,C), male(F).
spouse(H,W):-married(H,W), female(W).
spouse(W,H):-married(H,W), male(H).
child(P,C):-parent(C,P).
son(C,P):-parent(P,C), male(C).
daughter(C,P):-parent(P,C), female(C).
sibling(X,S):-mother(A,X), mother(A,S),father(B,X), father(B,S), X \= S.
brother(X,S):-mother(A,X), mother(A,S),father(B,X), father(B,S), X \= S, male(S).
sister(X,S):-mother(A,X), mother(A,S),father(B,X), father(B,S), X \= S, female(S).
uncle(X,U):-parent(A,X), brother(A,U).
uncle(X,U):-parent(A,X), sister(A,B), married(U,B).
aunt(X,A):-parent(C,X), sister(C,A).
aunt(X,A):-parent(C,X), brother(C,B), married(B,A).
grandparent(G,X):-parent(P,X), parent(G,P).
grandfather(G,X):-parent(P,X), parent(G,P), male(G).
grandmother(G,X):-parent(P,X), parent(G,P), female(G).
ancestor(X,Y):-parent(X,Y).
ancestor(X,Y):-ancestor(X,Z), parent(Z,Y).
descendant(X,Y):-child(Y,X).
descendant(X,Y):-descendant(X,Z), child(Y,Z).
older(X,Y):-born(X,W), born(Y,Z), W>Z.
younger(X,Y):-born(X,W), born(Y,Z), W<Z.
regentwhenborn(X,Y):-born(Y,W), reigned(X,B,E), W>B, W<E.
cousin(X,Y):- parent(W,X), parent(Z,Y), sibling(Z,W), X \= Y.
