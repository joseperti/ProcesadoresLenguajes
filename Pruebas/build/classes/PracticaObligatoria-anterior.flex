
package AnalizadorLexico;
import java_cup.runtime.*;

/*26-03*/
/*Información de versión: he modificado las palabras reservadas y se guarda la columna y la fila*/
/*He modficadfo comentario mal cerrado y constante literales mal cerradas y la acción que se leva a cabo*/

/*27-03*/
/*He añadido yytext() al crear todos los tokens*/
/*He modificado el mesaje que se muestra cuando no se reconoce un lexema*/




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

/*Macros*/
Digitos = [0-9]
Retorno = [\r]
Espacio = [" "]
Comentario_Mal_Cerrado_Tipo_1 = "{"[^}\n]*\n
Comentario_Mal_Cerrado_Tipo_2 = "(*"([^*)\n]|"*"[^)\n]|[^*\n]")")*\n
Comentario_Mal_Cerrado_Tipo_3 = "{"[^}\n]*
Comentario_Mal_Cerrado_Tipo_4 = "(*"([^*)\n]|"*"[^)\n]|[^*\n]")")*
Comentario_Mal_Cerrado = ({Comentario_Mal_Cerrado_Tipo_1}|{Comentario_Mal_Cerrado_Tipo_2}|{Comentario_Mal_Cerrado_Tipo_3}|{Comentario_Mal_Cerrado_Tipo_4})
Constante_Literal_Mal = "'"([^'\n]|"''")*\n


%%

/*Palbras reservadas*/
"program" {return new java_cup.runtime.Symbol(sym.program, yyline+1, yycolumn+1, yytext());}
"begin"   {return new java_cup.runtime.Symbol(sym.begin, yyline+1, yycolumn+1, yytext());}
"end"     {return new java_cup.runtime.Symbol(sym.end, yyline+1, yycolumn+1, yytext());}
"const"   {return new java_cup.runtime.Symbol(sym.ident_const, yyline+1, yycolumn+1, yytext());}
"var"     {return new java_cup.runtime.Symbol(sym.var, yyline+1, yycolumn+1, yytext());}
"procedure" {return new java_cup.runtime.Symbol(sym.procedure, yyline+1, yycolumn+1, yytext());}
"function"  {return new java_cup.runtime.Symbol(sym.function, yyline+1, yycolumn+1, yytext());}
"type" {return new java_cup.runtime.Symbol(sym.type, yyline+1, yycolumn+1, yytext());}
"of" {return new java_cup.runtime.Symbol(sym.of, yyline+1, yycolumn+1, yytext());}
"array" {return new java_cup.runtime.Symbol(sym.array, yyline+1, yycolumn+1, yytext());}
"record" {return new java_cup.runtime.Symbol(sym.record, yyline+1, yycolumn+1, yytext());}
"if" {return new java_cup.runtime.Symbol(sym.ident_if, yyline+1, yycolumn+1, yytext());}
"then" {return new java_cup.runtime.Symbol(sym.then, yyline+1, yycolumn+1, yytext());}
"else" {return new java_cup.runtime.Symbol(sym.ident_else, yyline+1, yycolumn+1, yytext());}
"while" {return new java_cup.runtime.Symbol(sym.ident_while, yyline+1, yycolumn+1, yytext());}
"do" {return new java_cup.runtime.Symbol(sym.ident_do, yyline+1, yycolumn+1, yytext());}
"for" {return new java_cup.runtime.Symbol(sym.ident_for, yyline+1, yycolumn+1, yytext());}
"to" {return new java_cup.runtime.Symbol(sym.to, yyline+1, yycolumn+1, yytext());}
"case" {return new java_cup.runtime.Symbol(sym.ident_case, yyline+1, yycolumn+1, yytext());}
"INTEGER" {return new java_cup.runtime.Symbol(sym.INTEGER, yyline+1, yycolumn+1, yytext());}
"REAL" {return new java_cup.runtime.Symbol(sym.REAL, yyline+1, yycolumn+1, yytext());}
"CHARACTER" {return new java_cup.runtime.Symbol(sym.CHARACTER, yyline+1, yycolumn+1, yytext());}

/*Signos de puntuacion*/
"," {return new java_cup.runtime.Symbol(sym.coma, yyline+1, yycolumn+1, yytext());}
";" {return new java_cup.runtime.Symbol(sym.puntoComa, yyline+1, yycolumn+1, yytext());}
"." {return new java_cup.runtime.Symbol(sym.punto, yyline+1, yycolumn+1, yytext());}
".." {return new java_cup.runtime.Symbol(sym.puntosRango, yyline+1, yycolumn+1, yytext());}
"(" {return new java_cup.runtime.Symbol(sym.parentesisAbierto, yyline+1, yycolumn+1, yytext());}
")" {return new java_cup.runtime.Symbol(sym.parentesisCerrado, yyline+1, yycolumn+1, yytext());}
"[" {return new java_cup.runtime.Symbol(sym.corcheteAb, yyline+1, yycolumn+1, yytext());}
"]" {return new java_cup.runtime.Symbol(sym.corcheteCe, yyline+1, yycolumn+1, yytext());}

/*Comparadores*/
"<" {return new java_cup.runtime.Symbol(sym.menor, yyline+1, yycolumn+1, yytext());}
"<=" {return new java_cup.runtime.Symbol(sym.menorIgual, yyline+1, yycolumn+1, yytext());}
">" {return new java_cup.runtime.Symbol(sym.mayor, yyline+1, yycolumn+1, yytext());}
">=" {return new java_cup.runtime.Symbol(sym.mayorIgual, yyline+1, yycolumn+1, yytext());}
"<>" {return new java_cup.runtime.Symbol(sym.distinto, yyline+1, yycolumn+1, yytext());}

/*Operadores*/
"+" {return new java_cup.runtime.Symbol(sym.suma, yyline+1, yycolumn+1, yytext());}
"-" {return new java_cup.runtime.Symbol(sym.menos, yyline+1, yycolumn+1, yytext());}
"*" {return new java_cup.runtime.Symbol(sym.asterisco, yyline+1, yycolumn+1, yytext());}
":=" {return new java_cup.runtime.Symbol(sym.dosPuntosIgual, yyline+1, yycolumn+1, yytext());}
"div"  {return new java_cup.runtime.Symbol(sym.div, yyline+1, yycolumn+1, yytext());}
"mod" {return new java_cup.runtime.Symbol(sym.mod, yyline+1, yycolumn+1, yytext());}
"and" {return new java_cup.runtime.Symbol(sym.and, yyline+1, yycolumn+1, yytext());}
"or" {return new java_cup.runtime.Symbol(sym.or, yyline+1, yycolumn+1, yytext());}
"not" {return new java_cup.runtime.Symbol(sym.not, yyline+1, yycolumn+1, yytext());}
":" {return new java_cup.runtime.Symbol(sym.dosPuntos, yyline+1, yycolumn+1, yytext());}
"=" {return new java_cup.runtime.Symbol(sym.igual, yyline+1, yycolumn+1, yytext());}

/*Espacios*/
\n {}
{Retorno} {}
{Espacio} {}
[	] {}



/*Numeros*/
[+-]?{Digitos}+ 				 {return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline+1, yycolumn+1, yytext());}
[+-]?{Digitos}+"."{Digitos}+ 	 {return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline+1, yycolumn+1, yytext());}

/*Numero hexadecimal*/
"$"[+-]?[0-9A-F]+				 {return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline+1, yycolumn+1, yytext());}
"$"[+-]?[0-9A-F]+"."[0-9A-F]+	 {return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline+1, yycolumn+1, yytext());}


/*Strings*/
"'"([^'\n]|"''")*"'"           	 {return new java_cup.runtime.Symbol(sym.string_const, yyline+1, yycolumn+1, yytext());}





/*Comentarios*/
"{"[^}]*"}"						 {System.out.println("Comentario en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" "+yytext());}
"(*"([^*]|"*"[^)])*"*"+")" 	 {System.out.println("Comentario en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" "+yytext());}

/*Identificadores*/
([a-zA-Z]|"_")([a-zA-Z0-9]|"_")*  {return new java_cup.runtime.Symbol(sym.Identificador, yyline+1, yycolumn+1, yytext());}

/*errorfallback*/

{Comentario_Mal_Cerrado} {System.err.println("Comentario sin cerrar en linea "+(yyline + 1)+" y columna "+(yycolumn + 1)+"\nSuponemos que el comentario "+yytext()+" acaba en el salto de linea.");}
{Constante_Literal_Mal} {System.err.println("Literal sin cerrar en linea "+(yyline + 1)+" y columna "+(yycolumn + 1)+"\nSuponemos que el literal "+yytext()+" acaba en el salto de linea.");}
. {System.err.println("Error léxico encontrado en "+yytext()+" en linea "+(yyline + 1)+" columna "+(yycolumn + 1));}


