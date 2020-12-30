# DragonBallApp

# Présentation:

## Informations générales:
- projet réalisé par : NGIN David
- Application : Monappli
- Statut : Etudiant
- Langage utilisé: KOTLIN
- logiciel utilisé: Android Studio

## Synthèse du projet:
Voici un projet simple qui permet d'afficher une page de login et une liste contenant des attributs sur les différents personnages de l'animé DragonBall Z. C'est une application qui permet donc de référencer des personnages mais aussi de donner des informations sur celui-ci. 

## Prérequis:
- Avoir installé Android Studio
- Avoir quelques notions en KOTLIN

## Ce que j'ai pu réalisé dans mon projet:
- Une Page de LOGIN qui permet de créer unc compte et de s'identifier
- Mise en place d'une publicité mensongère
- L'affichage d'une liste d'élements dans un RecyclerView 
- La création de mon propre API (API hébergé sur mon github "dbzApi.json")
- Le stockage de données en cache 
#### Au niveau de l'architecture du programme:
- Singletons
- MVC
- Design
- Set de l'image de l'application et de la liste d'éléments
- Set d'image pour chaques personnages

## Fonctionnalités :

### Voici le logo de mon application:
J'ai donc modifié l'icône android afin de réadapter le logiciel à mon programme:

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/LOGO.PNG)

### Voci la page de login de mon application:
- Nous pouvons voir un espace pour s'identifier avec un identifiant et un mot de passe. Un peu plus bas, on apercoit la publicité "mensongère"

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/Photo1.PNG)

### la publicité "mensongère:
- Nous pouvons voir qu'un message POP-UP qui apparait grâce au snackbar.

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/CLICKPUB.PNG)

### Identification sur l'application:
Pour pouvoir accéder à la liste, nous devons être enregistré dans l'application. Si nous utilisons déja un compte crée, nous n'allons pas avoir le message d'erreur

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/Photo1.PNG)

Le compte n'existant pas, on obtient un message d'erreur:

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/LOGIDERREUR.PNG)

En appuyant sur "INSCRIPTION" cela va automatiquement nous inscrire dans la base de donnée:

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/Photo1.PNG)

Ainsi quand on va se connecter grâce au bouton LOGIN, nous allons voir un message de SUCCESS pour ensuite être redirigé vers la liste :

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/SUCCESS.PNG)

Voici ensuite la redirection vers la liste :

![pictures](https://github.com/DavidNGIN/MonAppli/blob/master/pictures/API.PNG)
