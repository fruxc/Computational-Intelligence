domains
    x = integer
    l = integer*

predicates
    length(l,x)
    evenlength(l)
    oddlength(l)

clauses
    length([],0).

    length([X|List],Length) :-
        length(List,Length1),
        Length = Length1 + 1.

    evenlength(List) :-
        length(List,Length),
        Length mod 2 = 0.

    oddlength(List) :-
        length(List,Length),
        Length mod 2 <> 0.