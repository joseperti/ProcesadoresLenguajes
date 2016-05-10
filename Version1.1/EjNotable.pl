program EjemploNotable; 
function areaCuadrado ( lado: REAL ) : REAL ;
type miArray = array [ 0 .. 5 ] of INTEGER ;
var
	resultado: REAL;
begin
	resultado := +0.0;
	miArray[1] := 0;
	resultado := lado * lado + miArray[ 1 + 2 ];
	areaCuadrado := 1;
end; 
procedure intercambio ( v1, v2: INTEGER )  ;
var
	aux: INTEGER;
begin
	if ( v1 <> v2 ) then 
	begin
		aux := 0;
		aux := v1;
		v1 := v2;
		v2 := aux;
	end
end;
var
	medida: REAL;
	valor1, valor2: INTEGER;
begin
	medida := $4.A;
	valor1 := -3;
	valor2 := $F6;
	while medida < valor1 do medida := areaCuadrado( medida );
	intercambio(valor1, valor2);
end.