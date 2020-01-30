%% Queue using Prolog

Queue([]).

Queue(A,[X|Y],[X|Z]) :- Queue(A,X,Z).

Dequeue(A,[A|M],M).