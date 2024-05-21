Exercice 2a.3 : Ma retraite
1 Lire un nombre A correspondant à un âge (en années).

2 Selon l’âge fourni, le programme doit afficher l’un des messages suivants :

Vous êtes à la retraite depuis X années

Il vous reste X années avant la retraite.

C’est le moment de prendre sa retraite.

La valeur fournie n’est pas un âge valide.

La retraite est fixée à 60 ans.

 ```

VARIABLE

age est un entier

TRAITEMENT

ECRIRE "Veuillez saisir un age"

LIRE age 

SI (age >= 60) ALORS
	ECRIRE "Vous êtes à la retaite deuis" + age - 60
SINON SI (age < 60) ALORS
	ECRIRE "Il vous reste"  60 - age  "années avant la retraite"
sinon Si (age == 60) ALORS
	ECRIRE "C'est le moment de prendre sa retraite"
Sinon SI (age < 0 = alors
ECRIRE "La valeur fournie n'est pas un âge valide"