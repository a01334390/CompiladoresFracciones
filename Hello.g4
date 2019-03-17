grammar Hello;

prog: expr '\n';
    
expr: expr '+' term 
    | expr '-' term 
    | term;
    
term: term '*' factor
	| term '/' factor
	| factor;
	
factor: fraction
	| '('expr')';
	
fraction : digit '%' digit;

digit: '0' 
    |  '1' 
    |  '2' 
    |  '3' 
    |  '4' 
    |  '5' 
    |  '6' 
    |  '7' 
    |  '8' 
    |  '9';