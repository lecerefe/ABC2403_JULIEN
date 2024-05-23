Exercice 3.6 : Et le plus grand est…
Érire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui inqique ensuite quel est le plus grand parmi ces 20 nombres.

Exemple de fonctionnement du programme :

Entrez le nombre numéro 1 : 12
Entrez le nombre numéro 2 : 14
etc...
Entrez le nombre numéro 20: 6

Résultat : 
Le plus grand des nombres saisis est : 14.
14 était le nombre numéro 2.

VARIABLE 

plusPetit est un entier
nombre est un entier
plusGrand est un nombre entier 
i est un entier
numero est un entier

TRAINTEMENT

plusPetit <---- 1000
plusGrand <--- 0
numero < ---- 1

POUR ( i <-- 0, i < 20, i++) ALORS
	
ECIRE "Entre le nombre numéro", numero: "
LIRE nombre

nombre++


SI (nombre > plusGrand) ALORS
plusGrand <--- nombre

SIONON SI nombre < plusPetit ALORS
plusPetit <--- nombre

ECRIRE "Le plus grand des nombre saisi est: " , plusGrand , " " , plusPetit , " etait le nombre le plus petit saisi" 





