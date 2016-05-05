
package AnalizadorLexico;
import java_cup.runtime.*;
%%

%class AnalizadorLexico
%cup
%line
%column

%{
%}

%init{
%init}

%eof{
%eof}

Digitos = [0-9]
Retorno = [\r]
Espacio = [" "]
Comentario_Mal_Cerrado_Tipo_1 = "{"[^\n]*\n
Comentario_Mal_Cerrado_Tipo_2 = "(*"([^")"\n])*+\n
Comentario_Mal_Cerrado = ({Comentario_Mal_Cerrado_Tipo_1}|{Comentario_Mal_Cerrado_Tipo_2})
Constante_Literal_Mal = "'"([^']|"''")*\n


%%

"program" {return new java_cup.runtime.Symbol(sym.program);}
"begin"   {return new java_cup.runtime.Symbol(sym.begin);}
"end"     {return new java_cup.runtime.Symbol(sym.end);}
"const"   {return new java_cup.runtime.Symbol(sym.ident_const);}
"var"     {return new java_cup.runtime.Symbol(sym.var);}
"procedure" {return new java_cup.runtime.Symbol(sym.procedure);}
"function"  {return new java_cup.runtime.Symbol(sym.function);}
"div"  {return new java_cup.runtime.Symbol(sym.div);}
"mod" {return new java_cup.runtime.Symbol(sym.mod);}
"and" {return new java_cup.runtime.Symbol(sym.and);}
"or" {return new java_cup.runtime.Symbol(sym.or);}
"not" {return new java_cup.runtime.Symbol(sym.not);}
"type" {return new java_cup.runtime.Symbol(sym.type);}
"of" {return new java_cup.runtime.Symbol(sym.of);}
"array" {return new java_cup.runtime.Symbol(sym.array);}
"record" {return new java_cup.runtime.Symbol(sym.record);}
"if" {return new java_cup.runtime.Symbol(sym.ident_if);}
"then" {return new java_cup.runtime.Symbol(sym.then);}
"else" {return new java_cup.runtime.Symbol(sym.ident_else);}
"while" {return new java_cup.runtime.Symbol(sym.ident_while);}
"do" {return new java_cup.runtime.Symbol(sym.ident_do);}
"for" {return new java_cup.runtime.Symbol(sym.ident_for);}
"to" {return new java_cup.runtime.Symbol(sym.to);}
"case" {return new java_cup.runtime.Symbol(sym.ident_case);}
";" {return new java_cup.runtime.Symbol(sym.puntoComa);}
"." {return new java_cup.runtime.Symbol(sym.punto);}
"=" {return new java_cup.runtime.Symbol(sym.igual);}
":" {return new java_cup.runtime.Symbol(sym.dosPuntos);}
"(" {return new java_cup.runtime.Symbol(sym.parentesisAbierto);}
")" {return new java_cup.runtime.Symbol(sym.parentesisCerrado);}
"INTEGER" {return new java_cup.runtime.Symbol(sym.INTEGER);}
"REAL" {return new java_cup.runtime.Symbol(sym.REAL);}
"CHARACTER" {return new java_cup.runtime.Symbol(sym.CHARACTER);}
":=" {return new java_cup.runtime.Symbol(sym.dosPuntosIgual);}
"<" {return new java_cup.runtime.Symbol(sym.menor);}
"<=" {return new java_cup.runtime.Symbol(sym.menorIgual);}
">" {return new java_cup.runtime.Symbol(sym.mayor);}
">=" {return new java_cup.runtime.Symbol(sym.mayorIgual);}
"<>" {return new java_cup.runtime.Symbol(sym.distinto);}
"+" {return new java_cup.runtime.Symbol(sym.suma);}
"-" {return new java_cup.runtime.Symbol(sym.menos);}
"*" {return new java_cup.runtime.Symbol(sym.asterisco);}
"," {return new java_cup.runtime.Symbol(sym.coma);}
"[" {return new java_cup.runtime.Symbol(sym.corcheteAb);}
"]" {return new java_cup.runtime.Symbol(sym.corcheteCe);}
".." {return new java_cup.runtime.Symbol(sym.puntosRango);}

\n {}
{Retorno} {}
{Espacio} {}
[	] {}




[+-]?{Digitos}+ 				 {return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline+1, yycolumn+1, yytext());}
[+-]?{Digitos}+"."{Digitos}+ 	 {return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline+1, yycolumn+1, yytext());}

"$"[+-]?[0-9A-F]+				 {return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline+1, yycolumn+1, yytext());}
"$"[+-]?[0-9A-F]+"."[0-9A-F]+	 {return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline+1, yycolumn+1, yytext());}

"'"([^']|"''")*"'"           	 {return new java_cup.runtime.Symbol(sym.string_const, yyline+1, yycolumn+1, yytext());}

"{"[^}]*"}"						 {return new java_cup.runtime.Symbol(sym.Comentario, yyline+1, yycolumn+1, yytext());}
"(*"([^*]|"*"[^)])*"*"+")" 	 {return new java_cup.runtime.Symbol(sym.Comentario, yyline+1, yycolumn+1, yytext());}

([a-zA-Z]|"_")([a-zA-Z0-9]|"_")*  {return new java_cup.runtime.Symbol(sym.Identificador, yyline+1, yycolumn+1, yytext());}

/*errorfallback*/

{Comentario_Mal_Cerrado} {System.err.println("Comentario sin cerrar en linea "+yyline+1+" y columna "+yycolumn+1+"\nSuponemos que el comentario "+yytext()+" acaba en el salto de linea.");}

. {System.err.println("Error encontrado en "+yytext()+" en linea "+yyline+1+" columna "+yycolumn+1);}


