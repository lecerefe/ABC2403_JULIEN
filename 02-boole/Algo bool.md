
-- Les Propositions --^

pd: La porte droite est ouverte

pg: La porte gauche est ouverte

i: L’interrupteur du plafonnier est appuyé

L: La lumière du véhicule est allumée


pd pg   i    L
0 	0   0   0
0	0	1	1
0	1	0	1
0	1	1	1
1	0	0	1
1	0	1	1
1	1	0	1
1	1	1	1


l'epression booléenne simplifiée 

 L = pd + pg + i 





 P2 : Cb  =  couleur de base
 P3 : Cad1 = 1ere couleur additionelle 
 P4 : Cad2 = 2eme couleur additionelle 
 P1 : Cr = couleur résultat 



Table de verité**

P2 P3 P4 = P1
0  0  0  = 0
1  1  1  = 1 
1  0  0  = 0
1  0  1  = 0
1  1  0  = 0
0  0  1  = 0
0  1  0  = 0

**Expresion algébrique correspondante** 

P1 est vrai si P3 est vrai est P4 est vrai

P1 = P3 . P4



# Algorithme sipmlifié

Variable
p1 est un booléenne
P3 est un booléenne
P4 est un booléenne

TRAITEMENT 

SI P3 est VRAI ET P4 est VRAI ALORS
    ECRIRE 'la couleur n'est pas très claire'

    RESULTAT


    ## B. Le résultat attendu est Cr = couleur claire.