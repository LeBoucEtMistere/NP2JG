
# Network Protocol to Java Generator

Projet réalisé dans le cadre d'un Projet Long de 2ème année à Supélec Rennes, année 2018-2019, par :
Guilhem De Viry, Arthur Depasse, Thomas Furgé, encadré par :
G. Piolle et F. Tronel

Guide d'utilisation

## Prérequis 

- Maven installé sur le système
- Une installation d'Eclipse comprenant le Framework EMF

## Installation

Lancer Eclipse
Aller au menu *Help > Install Software*
puis cliquer sur le bouton *Add* et enfin *Archive*
Sélectionner l'archive *UpdateSite0.0.1.zip* dans le dossier *artifacts*

Ouvrir le repo Maven courant (en général ~/.m2) et y décompresser l'archive contenant la librairie *fsm_lib*
(note : le projet de dév de cette lib peut-être trouvé à l'addresse : https://github.com/LeBoucEtMistere/FSM-lib

## Utilisation

Dans Eclipse créer un nouveau *Modeling Project*, puis faire un clic droit dessus et sélectionner :
*New > Other... >fsm example wizard*

Ouvrir le fichier *representation.aird*, activer le viewpoint et créer un nouveau diagramme.

Editer à souhait le diagramme puis sauvegarder.

Pour lancer la génération du code java faire un clic droit sur le fichier .fsm et sélectionner l'option de génération de code.

une fois les fichiers générés vous pouvez éditer le contenu des actions et des gardes.

Génération des clés client et server :

Ne pas oublier d'éditer le script de génération se trouvant dans le dossier *artifacts* pour inclure les infos sur l'entreprise puis les lancer pour générer les keystore, et les répartir entre client et serveur.
