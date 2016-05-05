

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
        int cont = 1;
	ventanaNueva nuevaInterfaz;
        public void imprimirMensaje(String s){
		nuevaInterfaz.imprimirMensaje(s);
	}

        public void imprimirError(String s){
		nuevaInterfaz.imprimirError(s);
	}

        AnalizadorLexico(java.io.Reader in,ventanaNueva i){
            nuevaInterfaz = i;
            this.zzReader = in;
        }

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
"program" {imprimirMensaje("Token "+"programa"+" reconocido.");return new java_cup.runtime.Symbol(sym.program, yyline+1, yycolumn+1, yytext());}
"begin"   {imprimirMensaje("Token "+"begin"+" reconocido.");return new java_cup.runtime.Symbol(sym.begin, yyline+1, yycolumn+1, yytext());}
"end"     {imprimirMensaje("Token "+"end"+" reconocido.");return new java_cup.runtime.Symbol(sym.end, yyline+1, yycolumn+1, yytext());}
"const"   {imprimirMensaje("Token "+"const"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_const, yyline+1, yycolumn+1, yytext());}
"var"     {imprimirMensaje("Token "+"var"+" reconocido.");return new java_cup.runtime.Symbol(sym.var, yyline+1, yycolumn+1, yytext());}
"procedure" {imprimirMensaje("Token "+"procedure"+" reconocido.");return new java_cup.runtime.Symbol(sym.procedure, yyline+1, yycolumn+1, yytext());}
"function"  {imprimirMensaje("Token "+"function"+" reconocido.");return new java_cup.runtime.Symbol(sym.function, yyline+1, yycolumn+1, yytext());}
"type" {imprimirMensaje("Token "+"type"+" reconocido.");return new java_cup.runtime.Symbol(sym.type, yyline+1, yycolumn+1, yytext());}
"of" {imprimirMensaje("Token "+"of"+" reconocido.");return new java_cup.runtime.Symbol(sym.of, yyline+1, yycolumn+1, yytext());}
"array" {imprimirMensaje("Token "+"array"+" reconocido.");return new java_cup.runtime.Symbol(sym.array, yyline+1, yycolumn+1, yytext());}
"record" {imprimirMensaje("Token "+"record"+" reconocido.");return new java_cup.runtime.Symbol(sym.record, yyline+1, yycolumn+1, yytext());}
"if" {imprimirMensaje("Token "+"if"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_if, yyline+1, yycolumn+1, yytext());}
"then" {imprimirMensaje("Token "+"then"+" reconocido.");return new java_cup.runtime.Symbol(sym.then, yyline+1, yycolumn+1, yytext());}
"else" {imprimirMensaje("Token "+"else"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_else, yyline+1, yycolumn+1, yytext());}
"while" {imprimirMensaje("Token "+"while"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_while, yyline+1, yycolumn+1, yytext());}
"do" {imprimirMensaje("Token "+"do"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_do, yyline+1, yycolumn+1, yytext());}
"for" {imprimirMensaje("Token "+"for"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_for, yyline+1, yycolumn+1, yytext());}
"to" {imprimirMensaje("Token "+"to"+" reconocido.");return new java_cup.runtime.Symbol(sym.to, yyline+1, yycolumn+1, yytext());}
"case" {imprimirMensaje("Token "+"case"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_case, yyline+1, yycolumn+1, yytext());}
"INTEGER" {imprimirMensaje("Token "+"INTEGER"+" reconocido.");return new java_cup.runtime.Symbol(sym.INTEGER, yyline+1, yycolumn+1, yytext());}
"REAL" {imprimirMensaje("Token "+"REAL"+" reconocido.");return new java_cup.runtime.Symbol(sym.REAL, yyline+1, yycolumn+1, yytext());}
"CHARACTER" {imprimirMensaje("Token "+"CHARACTER"+" reconocido.");return new java_cup.runtime.Symbol(sym.CHARACTER, yyline+1, yycolumn+1, yytext());}

/*Signos de puntuacion*/
"," {imprimirMensaje("Token "+"coma"+" reconocido.");return new java_cup.runtime.Symbol(sym.coma, yyline+1, yycolumn+1, yytext());}
";" {imprimirMensaje("Token "+"puntoComa"+" reconocido.");return new java_cup.runtime.Symbol(sym.puntoComa, yyline+1, yycolumn+1, yytext());}
"." {imprimirMensaje("Token "+"punto"+" reconocido.");return new java_cup.runtime.Symbol(sym.punto, yyline+1, yycolumn+1, yytext());}
".." {imprimirMensaje("Token "+" puntosRango "+" reconocido.");return new java_cup.runtime.Symbol(sym.puntosRango, yyline+1, yycolumn+1, yytext());}
"(" {imprimirMensaje("Token "+"parentesisAbierto"+" reconocido.");return new java_cup.runtime.Symbol(sym.parentesisAbierto, yyline+1, yycolumn+1, yytext());}
")" {imprimirMensaje("Token "+"parentesisCerrado"+" reconocido.");return new java_cup.runtime.Symbol(sym.parentesisCerrado, yyline+1, yycolumn+1, yytext());}
"[" {imprimirMensaje("Token "+"corcheteAb"+" reconocido.");return new java_cup.runtime.Symbol(sym.corcheteAb, yyline+1, yycolumn+1, yytext());}
"]" {imprimirMensaje("Token "+"corcheteCe"+" reconocido.");return new java_cup.runtime.Symbol(sym.corcheteCe, yyline+1, yycolumn+1, yytext());}

/*Comparadores*/
"<" {imprimirMensaje("Token "+"menor"+" reconocido.");return new java_cup.runtime.Symbol(sym.menor, yyline+1, yycolumn+1, yytext());}
"<=" {imprimirMensaje("Token "+"menorIgual"+" reconocido.");return new java_cup.runtime.Symbol(sym.menorIgual, yyline+1, yycolumn+1, yytext());}
">" {imprimirMensaje("Token "+"mayor"+" reconocido.");return new java_cup.runtime.Symbol(sym.mayor, yyline+1, yycolumn+1, yytext());}
">=" {imprimirMensaje("Token "+"mayorIgual"+" reconocido.");return new java_cup.runtime.Symbol(sym.mayorIgual, yyline+1, yycolumn+1, yytext());}
"<>" {imprimirMensaje("Token "+"distinto"+" reconocido.");return new java_cup.runtime.Symbol(sym.distinto, yyline+1, yycolumn+1, yytext());}

/*Operadores*/
"+" {imprimirMensaje("Token "+"+"+" reconocido.");return new java_cup.runtime.Symbol(sym.suma, yyline+1, yycolumn+1, yytext());}
"-" {imprimirMensaje("Token "+"-"+" reconocido.");return new java_cup.runtime.Symbol(sym.menos, yyline+1, yycolumn+1, yytext());}
"*" {imprimirMensaje("Token "+"*"+" reconocido.");return new java_cup.runtime.Symbol(sym.asterisco, yyline+1, yycolumn+1, yytext());}
":=" {imprimirMensaje("Token "+":="+" reconocido.");return new java_cup.runtime.Symbol(sym.dosPuntosIgual, yyline+1, yycolumn+1, yytext());}
"div"  {imprimirMensaje("Token "+"div"+" reconocido.");return new java_cup.runtime.Symbol(sym.div, yyline+1, yycolumn+1, yytext());}
"mod" {imprimirMensaje("Token "+"mod"+" reconocido.");return new java_cup.runtime.Symbol(sym.mod, yyline+1, yycolumn+1, yytext());}
"and" {imprimirMensaje("Token "+"and"+" reconocido.");return new java_cup.runtime.Symbol(sym.and, yyline+1, yycolumn+1, yytext());}
"or" {imprimirMensaje("Token "+"or"+" reconocido.");return new java_cup.runtime.Symbol(sym.or, yyline+1, yycolumn+1, yytext());}
"not" {imprimirMensaje("Token "+"not"+" reconocido.");return new java_cup.runtime.Symbol(sym.not, yyline+1, yycolumn+1, yytext());}
":" {imprimirMensaje("Token "+"dosPuntos ':'"+" reconocido.");return new java_cup.runtime.Symbol(sym.dosPuntos, yyline+1, yycolumn+1, yytext());}
"=" {imprimirMensaje("Token "+"igual"+" reconocido.");return new java_cup.runtime.Symbol(sym.igual, yyline+1, yycolumn+1, yytext());}

/*Espacios*/
\n {}
{Retorno} {}
{Espacio} {}
[	] {}



/*Numeros*/
[+-]?{Digitos}+ 				 {imprimirMensaje("Token "+"numeric_integer_const"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline+1, yycolumn+1, yytext());}
[+-]?{Digitos}+"."{Digitos}+ 	 {imprimirMensaje("Token "+"numeric_real_const"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline+1, yycolumn+1, yytext());}

/*Numero hexadecimal*/
"$"[+-]?[0-9A-F]+				 {imprimirMensaje("Token "+"numeric_integer_const"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline+1, yycolumn+1, yytext());}
"$"[+-]?[0-9A-F]+"."[0-9A-F]+	 {imprimirMensaje("Token "+"numeric_real_const"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline+1, yycolumn+1, yytext());}

/*Errores hexadecimal*/
"$."[0-9A-F]+                    {imprimirError("Error léxico "+cont+" en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" \nFalta parte entera "+yytext()+""+"\n");cont++;}
"$"[+-]?[0-9A-F]+"."   {imprimirError("Error léxico "+cont+" en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" \nFalta parte decimal "+yytext()+""+"\n");cont++;}

/*Strings*/
"'"([^'\n]|"''")*"'"           	 {imprimirMensaje("Token "+"string_const"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.string_const, yyline+1, yycolumn+1, yytext());}





/*Comentarios*/
"{"[^}]*"}"						 {imprimirMensaje("Reconocido comentario en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" '"+yytext()+"'");}
"(*"([^*]|"*"[^)])*"*"+")" 	 {imprimirMensaje("Reconocido comentario en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" '"+yytext()+"'");}

/*Identificadores*/
([a-zA-Z]|"_")([a-zA-Z0-9]|"_")*  {imprimirMensaje("Token "+"Identificador"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.Identificador, yyline+1, yycolumn+1, yytext());}

/*errorfallback*/

{Comentario_Mal_Cerrado} {imprimirError("Error léxico "+cont+"\nComentario sin cerrar en linea "+(yyline + 1)+" y columna "+(yycolumn + 1)+"\nSuponemos que el comentario '"+yytext()+"' acaba en el salto de linea."+"\n");cont++;}
{Constante_Literal_Mal} {imprimirError("Error léxico "+cont+"\nLiteral sin cerrar en linea "+(yyline + 1)+" y columna "+(yycolumn + 1)+"\nSuponemos que el literal '"+yytext()+"' acaba en el salto de linea."+"\n");cont++;}
. {imprimirError("Error léxico "+cont+" encontrado en "+yytext()+" en linea "+(yyline + 1)+" columna "+(yycolumn + 1)+"\n");cont++;}