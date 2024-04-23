 # Exercice 1.1 : Hello World
```
ECRIRE "Hello World"
``` 

## Exercice 1.2 : Hello You
L'utilisateur est invité à saisire son prénom dans la console.

Le Programe affiche "Bonjour" suivi du prénom saisi.

```

VARIABLES
prenom est une CHAINE DE CARACTERES

TRAITEMENT
ECRIRE "Saisissez votre prénom"
LIRE prenom
ECRIRE "Bonjour" , Prenom, "."
```
Alternative avec controle sur la longeur du prénom
```

VARIABLES
prenom est une CHAINE DE CARACTERES

TRAITEMENT
ECRIRE "Saisissez votre prénom"
LIRE prenom
SI prenom.LONGUEUR > 2
ECRIRE "Bonjour" , Prenom, "."
    SINON
        ECRIRE "Prénom invalide"
    FIN SI
```


# Exercice 1.3 : Calcul de la moyenne de 2 nombres

```
VARIABLE nom de la variable est une nombre entier

VARIABLE nom de la variable est une nombre decimal

VARIABLE La moyen des deux nombre 

TRAINTEMENT 

ECRIRE "saisiser deux Nombre entier"
