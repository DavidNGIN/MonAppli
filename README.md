# Application Mobile : DragonBall Z

# Présentation:

## Informations générales:
- projet réalisé par : NGIN David
- Application : DBZ
- Statut : Etudiant
- Langage utilisé: KOTLIN
- logiciel utilisé: Android Studio

## Synthèse du projet:
Voici un projet simple qui permet d'afficher une page de login et une liste contenant des attributs sur les différents personnages de l'animé DragonBall Z. C'est une application qui permet donc de référencer des personnages mais aussi de donner des informations sur celui-ci. 

## Prérequis:
- Avoir installé Android Studio
- Avoir quelques notions en KOTLIN

## Ce que j'ai pu réalisé dans mon projet:
- Affichage d'une page de LOGIN
- L'affichage d'une liste d'élements dans un RecyclerView 
- Mise en place d'une base de donnée pour la prise en compte d'utilisateur (grâce à ROOM)
- Mise en place d'une API REST 
- La création de mon propre API (API hébergé sur mon github "dbzApi.json")
- Le stockage de données en cache 
- Tests Unitaires

#### Au niveau de l'architecture du programme:
- Clean Architecture
- MVVM
- Design
- Set de l'image de l'application et de la liste d'éléments
- Set d'image pour chaques personnages


## Fonctionnalités :

### Voici le logo de mon application:
- J'ai donc modifié l'icône android afin de réadapter le logiciel à mon programme:

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/LOGOAPPLI.PNG)

### Voci la page de login de mon application:
- Nous pouvons voir un espace pour s'identifier avec un identifiant et un mot de passe. Un peu plus bas, on apercoit la publicité "mensongère"

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/Photo1.PNG)

### la publicité "mensongère:
- Nous pouvons voir qu'un message POP-UP apparait en turquoise lorsqu'on clique sur le bouton "CLICK HERE" grâce à la fonctionnalité SNACKBAR.

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/CLICKPUB.PNG)

### Identification sur l'application:
- Pour pouvoir accéder à la liste, nous devons être enregistré dans l'application. Si nous utilisons déja un compte crée, nous n'allons pas avoir le message d'erreur

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/LOGIDENREGISTRER.PNG)

- Le compte n'existant pas, on obtient un message d'erreur:

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/LOGIDERREUR.PNG)

- En appuyant sur "INSCRIPTION" cela va automatiquement nous inscrire dans la base de donnée:

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/Photo1.PNG)

- Ainsi quand on va se connecter grâce au bouton LOGIN, nous allons voir un message de SUCCESS pour ensuite être redirigé vers la liste :

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/SUCCESS.PNG)

- Voici ensuite la redirection vers la liste :

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/APIFINAL.PNG)

### Enfin, mon application fonctionne aussi sans connexion internet:
- Stockage de données en cache
J'active donc le mode avion:

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/WITHOUTINTERNET.PNG)

- L'application reste toujours fonctionelle :

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/MODEAVIONS.PNG)



