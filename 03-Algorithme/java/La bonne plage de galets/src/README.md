Exercice 3.2 : La bonne plage de galets
Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.


 ```
 
 VARIABLE
 
 nombre est un entier
 
 TRAITEMENT
 
 FAIR 
 	ECRIRE "Saisir un nombre entre 10 et 20"
 LIRE nombre
 
 SI (nombre <10) ALORS
 	ECRIRE "Plus grand !"
 SINON SI (nombre >20) ALORS
 	ECRIRE "Plus petit !"
 
TANT QUE ( nombre <10 ou nombre >20)
	ECRIRE " Yes, you did it !"
 