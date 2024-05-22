Exercice 3.5 : La factorielle
Écrire un algorithme qui demande à l’utilisateur de saisir un nombre, et qui calcule et affiche sa factorielle.

Par exemple, si l’utilisateur saisit le nombre 8, le programme doit afficher :

La factorielle de 8 est: 40320

NB : la factorielle de 8, notée 8!, vaut 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8

 ```` 

VARIABLE

nombre est un entier
factorielle est un entier
i est un entier

TRAITEMENT 

ECRIRE "Saisir un nombre"
LIRE nombre

factorielle <----1


POUR (i <--- 0 , i <= nombre , i++) ALORS
 factorielle *= i
 
 
 
ECRIRE "la factorielle du nombre" +nombre + " est: " factorielle