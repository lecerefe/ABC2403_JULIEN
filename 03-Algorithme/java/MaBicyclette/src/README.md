// VARIABLES

beauTemps est un BOOLEEN
veloOk est un BOOLEEN
reparationsImmediates est un BOOLEEN
livrePossede est un BOOLEEN
livreDispoBibliotheque est un BOOLEEN


// TRAITEMENT

	SI beauTemps = VRAI ALORS
	
		ECRIRE "Je vais me ballader"
		
		SI veloOk = VRAI ALORS
			ECRIRE "j'irai me ballader à bicyclette"
		SINON 
		
			ECRIRE "Je vais chez le garagiste"
			
			SI reparationsImmediates = VRAI ALORS 
				ECRIRE "j'irai me ballader à bicyclette"
			SINON
				ECRIRE "J'irai cueillir des joncs"
			FIN SI
			
		FIN SI
		
	SINON
		ECRIRE "je vais lire un livre"
		
		SI livrePossede = FAUX ALORS
					 
			ECRIRE "Je vais à la bibliothèque"
			
			SI livreDispoBibliotheque = VRAI ALORS
				ECRIRE "J'emprunte GoT"
			SINON
				ECRIRE "J'emprunte un roman policier"
				
			FIN SI
			
			ECRIRE "Je rentre chez moi"
		SINON
			ECRIRE "Je lis GoT"
		FIN SI
		
		ECRIRE "Lecture de mon livre dans le fauteuil"
	FIN SI


//RESULTAT 


