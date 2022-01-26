# API REST Vol

## Sommaire
1. [General Info](#général-info)
2. [Démarrage](#démarrage)
3. [API Info](#api-info)
4. [Collaboration](#collaboration)
5. [FAQ](#faq)

## Général Info

API REST Vol est un projet d'API permettant de répondre à une problématique de réservation de vol. Le but de ce projet est de se familiariser avec  les API REST ainsi que TOMCAT.

## Démarrage
### Prérequis

Pour lancer l'API vous aurez besoin d'un serveur TOMCAT configuré avec eclipse.
**$MENU** = Menu d'Eclipse (Files, etc)
**$PROJET** = Menu clic droit sur le projet
**$TOMCAT_HOME** = Le chemin où vous avez installé TOMCAT
**SERVER_UI** = Menu clic droit dans l'interface Server
**SERVER** = Menu clic droit sur le serveur

### 1. Installation modules eclipse pour TOMCAT

Pour installer TOMCAT, nous avons besoin des modules présents dans le Repository d'Eclipse.

Si vous ne l'avez pas déjà ajoutez le :

``` 
$MENU Help > install new softwares > Work with "http://download.eclipse.org/releases/latest" 
```

Une fois ajouté, déroulez **Web, XML, Java EE and OSGi Enterprise Development** et cocher les modules suivants : 
* Eclipse Java Web Developer Tools, 
* Eclipse web developer tools, 
* Eclispe Java EE developer tools, 
* JST Server Adapters, 
* JST Server Adapters Extensions (Apache tomcat)

Appuyez sur **Next** puis installez le dans le répertoire de votre choix (**$TOMCAT_HOME**).


### 2. Configuration projet maven

Pour continuer, nous avons besoin de configurer le projet.

Pour commencer on va ajouter un module qui permet à Tomcat d'interpréter notre projet comme une webApp de Tomcat.
```
$PROJET Properties > Project Facets > Cochez "Dynamic Web Module"
```
Faites un clean sur le projet
```
$MENU Project > Clean
```
Puis mettez le à jour
```
$PROJET Maven > Update Project
```
Ajoutez le module
```
$PROJET Properties > Deployment Assembly > Add ... > Java Build Path Entries > Maven dépendencies > Apply and close
```

### 3. Installer keycloak 

Pour faire fonctionner notre API comme prévu vous aurez besoin d'installer **Keycloak**
* Téléchargez le keycloak pour Tomcat https://www.keycloak.org/downloads
* Dézippez votre zip dans votre **$TOMCAT_HOME/lib/**
Pour linux :
```
cd $TOMCAT_HOME/lib
unzip keycloak-tomcat-adaptater-dist.zip
```

### 4. Installation serveur

Pour lancer notre projet maintenant, nous avons besoin de creer un serveur Tomcat.

Ouvrer l'interface Servers
```
$MENU Windows > Show view > Other ... > Servers
```
Ajoutez votre server
```
$SERVER_UI Servers > New > Server 
```
Choisissez Apache tomcat V9 et donnez un nom explicite à votre server.
```
$SERVER Add and remove > Ajouter le projet > Start
```

## API Info

Pour accèder aux infos transmises sur l'API vous pouvez utiliser le logiciel `insomnia` ou bien `postman` à l'url `http://localhost:8080/api-rest-vol/{url}`. L'API est configurée pour renvoyer un JSON.

| URL  | Type          | infos |
| :--------------- |:---------------| :-----|
| /companies  | GET        |   Obtenir la liste des compagnies |
| /companies/:id/  | GET             |   Obtenir les informations d'une compagnie |
| /companies/:id/flights  | GET             |   Obtenir la liste des vols d'une compagnie |
| /flights  | GET             |   Obtenir la liste des vols |
| /flights/:id/  | GET             |   Obtenir les informations d'un vol |
| /flights/:id/places  | GET             |   Obtenir la liste des places d'un vol (disponibles et non disponibles) |
| /places    | GET          |    Obtenir la liste des places (disponibles et non disponibles) |
| /places/:id     | GET          |    Obtenir les informations d'une place |

## Collaboration

Ce projet est réalisé dans le contexte d'un TP donné en **Web services avancés** par l'IMT Alès, France.

Les membres du groupe sont :
* @Jeann3, apprentie ingénieure en développement logiciel
* @PixelsDrM, apprenti ingénieur en développement logiciel
* @Noupp, apprentie ingénieure en développement logiciel

## FAQ
Aucunes questions/problèmes pour le moment.
