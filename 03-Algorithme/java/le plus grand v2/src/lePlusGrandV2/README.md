Exercice 3.7 : Et le plus grand est… encore.
Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.

 ```

VARIABLE

nombre et un entier
plusGrand et un entier
plusPetit et un entier
i et un entier
numero et un entier



TRAITEMENT
plusPetit <---1000
plusGrand <--- 0
i<--- 0
numero <---- 1

ECRIRE "Saisir combien de nombre avez vous besois"
LIRE NOMBRE

TANT QUE ( i < nombre) ALORS

ECRIRE "Saisir le nombre" + numero + " "
LIRE nombre

SI (nombre > plusGrand) ALORS
	plusGrand <---- nombre

SI (nombre < plusPetit) ALORS
	plusPetit <---- nombre)
	
	i++
	numero++
	
ECRIRE "Le plus grand des nombres saisis est :" + plusGrand + "est le plus petit " + plusPetit