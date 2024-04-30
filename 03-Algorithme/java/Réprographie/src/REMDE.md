# Réprographie

Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.


## Pseudo Code
```
CONSTANTES

P1 est un REEL <-- 0.10
P2 est un REEL <-- 0.09
P3 est un REEL <-- 0.08

VARIABLE

	nombreDeCopies est ENTIER
	montentDeLafacture est un NOMBRE REEL
	
TRAINTEMENT

ECRIRE "saisiser le nombre de photocopies: "
LIRE nombreDeCopies

 SI nombreDeCopies <=10
 ALORS
 	montantDeLaFacture <-- nombreDeCopies * P1
 SINON SI nombreDeCopies <= 30
 ALORS
 	montentDeLaFacture <-- 10 * P1 + (nombreDeCopies - 10) * P2
 SINON
 		montantDeLaFacture <-- 10 * P1 + 20 * P2 + (nombreDeCopies - 30) * P3
 FIN SI
 
 RESULTA 
 
 ECRIRE "A payer: ", montentDeLaFacture, "€"
 

	
	
	 