# J'irai me promener s'il fait plus de 25°C et qu'il ne pleut pas, ou si ma copine le veut.

Le problème se décrit par : 
- P1 est vraie si P2 est vraie ET P3 est fausse, ou si P4 est vraie.
SOit : 
- P1=(P2 ET NON P3) OU P4.


## Algorithme (Pseudo Code)

**VARIALBES**
- sePromener = est un BOOLEEN
- iFaitPlusDe25 = est un BOOLEEN
- ilPleut = est un BOOLEEN
- maCopineVeutSePromener = est un BOOLEEN 

**TRAITEMENT** 
```
**ECRIRE** "Fait-il plus de 25 degrés ?"

LIRE ilFaitPlusDe25

ECRIRE "Pleut-il ?"
LIRE ilPleut

ECRIRE "Est-ce que ma copine veut se prommener ?"
LIRE macopineVeutSePromener

SI ilFaitPlusDe25 est VRAI ET ilPleut est FAUX OU maCopineVeutSePromener est Vrai
    sePromener <-- VRAI
    sePromener := VRAI // notation alternative
SINON ALORS
FIN SI


**RESULTAT**

SI sePromener est VRAI ALORS
    ECRIRE "Tu peut ammer te promener"
SINON ALORS
    ECRIRE "Tu restes chez toi"
FI SI
``` 