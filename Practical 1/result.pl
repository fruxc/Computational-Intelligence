%% result grade scheme 75+ A 60+ B 50+ C 35+ P 35< F
grade(N,f) :- N>=75, write('First Class'),nl , ! .
grade(N,s) :- N>=60, write('Second Class'),nl , ! .
grade(N,t) :- N>=50, write('Third Class'),nl , ! .
grade(N,p) :- N>=35, write('Pass'),nl , ! .
grade(N,fa) :- N<35, write('Fail'),nl.