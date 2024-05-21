Exercice 2a.4 : Tri de nombres++

Lire 3 nombres entier A, B et C puis les afficher dans l’ordre décroissant.

 ` `` 

VARIABLE 

a est un entier

b est un entier

c est un entier

TRAITEMENT

ECRIRE "Saisir trois nombres entier"
LIRE a, b, c

SI (a >= b et a >= c)
SI ( b >= c ) ALORS
	ECRIRE a , b , c
SINION 
	ECRIRE a, c , b

SINON SI (b >= a et b >= c)
SI (a >= c) ALORS
	ECRIRE b , a , c
SINON 
	ECRIRE b , c , a 
SI a >= b
	ECRIRE c, a , b
SINON 
	ECRIRE c, b , a
