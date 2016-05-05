import java_cup.runtime.*;
%%

%class AnalizadorLexico
%unicode
%line
%column
%cup

%%

"=" {return new java_cup.runtime.Symbol(sym.igual);}
"+" {return new java_cup.runtime.Symbol(sym.op_mas);}
"*" {return new java_cup.runtime.Symbol(sym.op_mul);}
[a-zA-Z]+ {return new java_cup.runtime.Symbol(sym.ident);}

/*errorfallback*/
.|\n {System.out.println("Esto falla"+yyline+" "+yycolumn);}