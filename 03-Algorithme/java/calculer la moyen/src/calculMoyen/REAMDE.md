Décrivez et codez l'algorithme 

 ```` 

 
fonction calculerMoyenne( tableau est un tableau d'entier, somme est un entier)

pour (i<-- 0; tableau.length; i++) {
	somme += tableau[i];
}

moyenne est un float

moyenne<--- (float)somme / (float)tableau.legth;

ECRIRE ("Moyenne des valeurs du tableau : " + moyenne)

FIN de fonction calculerMoyenne

VARIABLE 

numbers[] est un tableau d entier
plusGrand est un entier <--- 0
auCarrer est un entier <--- 0
numbers <--- {2, 4, 1, 8, 6 , 14, 23, 7, 42}

TRAITEMENT

ECRIRE "Bienvenue dans le programme de calcul du tableau d'entier"

APPELLE DE LA FONCTION (numbers, 0)

POUR(i<--- 0; i < numbers.legth; i++) {

SI (plusGrand < numbers[i] {
	plusGrand = numbers[i]
FIN SI
	FIN SI

 auCarrer = (plusGrand * plusGrand)
 
 ECRIRE "Valeurs la plus grand " + "(" + plusGrand + ")" + "élevée au carré : " + auCarrer

