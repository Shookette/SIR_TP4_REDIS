# SIR_TP4_REDIS 

TP REDIS
===================

Groupe : Anne-Sophie Balestra et Jérémy Viallatte.

**Question**
-------------------------

***Quelles sont les types de données stockés dans Redis, que peut on faire comme types de requêtes ? (à répondre dans le compte rendu de TP (le readme)***

> Redis stocke des données sous forme de collection clé - valeur.
Il est donc possible de stocker du texte (String). Il n’est pas possible de stocker des objets à moins de les sérialiser, la commande set de Jedis n’accepte qu’un String.
Redis permet du coup de faire seulement des requête d’insertion, de selection basique (à partir d’une clé, sous la forme d’un get) et une suppression.
