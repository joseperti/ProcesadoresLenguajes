program EjemploAprobado; 
function areaCuadrado ( lado: REAL ) : REAL ;
var
	resultado: REAL;
	valor3, valor4: INTEGER;
begin
	resultado := +0.0;
	resultado := lado * lado;
	areaCuadrado := resultado; 
end;
procedure intercambio ( v1, v2: INTEGER )  ;
var
	aux: INTEGER;
begin
	aux := 0;
	aux := v1;
	v1 := v2;
	v2 := aux;
end;
var
	medida: REAL;
	valor1, valor2: INTEGER;
begin
	medida := $4.A;
	valor1 := -3;
	valor2 := $F6;
	medida := areaCuadrado(medida);
	intercambio(valor1, valor2);
end.