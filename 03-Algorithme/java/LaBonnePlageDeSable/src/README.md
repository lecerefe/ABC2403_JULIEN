Exercice 3.1 : La bonne plage de sable
Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

 ```
VARIABLE

nombre est un entier

TRAITEMENT 

FAIR 
	ECRIRE "Saisiser un nombre entre 1 et 3"
LIRE nombre
	TANT QUE (nombre <1 et nombre >3 ALORS	
		ECRIRE "Bravo vous avez réussi"