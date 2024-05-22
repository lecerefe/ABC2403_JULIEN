Exercice 3.4 : La somme
Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.

Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :

La somme des nombres jusque 5 est: 15

NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.



VARIABLE

nombreDepart est un entier
Somme est un entier
i est un nombre entier


TRAITEMENNT 

somme <--- 0 

ECRIRE "Saisir un nombre de depart"
LIRE nombreDepart

POUR ( i <---1, i <= nombreDepart, i++)
ALORS 
	somme <----  += i

ECRIRE "La somme du nombre est : " + somme