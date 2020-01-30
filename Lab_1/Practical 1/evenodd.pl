%%Create a list of even and odd number and check whether input is odd or even.
even(N) :-
(between(0, inf, N); integer(N) ),
0 is N mod 2.