Exercice 2a.2 : Es-tu majeur ?
Lire un nombre A correspondant à un âge (en années).
Afficher “Vous êtes majeur” ou “Vous êtes mineur” selon le cas.
Pour un nombre négatif le message doit être “Vous n’êtes pas encore né”.
La majorité est fixée à 18 ans.

  ```` 

VARIABLE

 age est un entier
 
 TRAITEMENT
 
 ECRIRE "Veuillez saisir votre age: "
 			
 	Si (age < 18 et age > 0) ALORS
 		ECRIRE "Vous êtes mineur"
 		
 	SINON SI( age <= 0) ALORS
 		ECRIRE "Vous n'êtes pas encore née"
 	
 	SINON 
 		ECRIRE "Vous êtes majeur"
 		
 	 ```` 
 	