%%Stack without using list
stack_empty(bottom).
stack_push(S, X, (X, S)).

revlist_push(S0, [], S0).
revlist_push(S0, [X|T], S):-
    stack_push(S0, X, S1),
    revlist_push(S1, T, S).

revlist_pop(S0, []):- stack_empty(S0). % bottom of stack
revlist_pop(S0, [X|T]):-
    stack_push(S1, X, S0), % pop - is reverse push
    revlist_pop(S1, T).

revlist(L0, L):-
    stack_empty(S0),
    revlist_push(S0, L0, S),
    revlist_pop(S, L).