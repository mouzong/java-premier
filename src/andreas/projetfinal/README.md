# Projet de gestion d'une agence immobiliere

## Ce projet vise à réaliser une application de gestion d'une agence immobilière dans le cadre de 
## l'assimilation des notions vues en cours de programmation java

### Introduction

### Entités
 - Client : 
   - prenom 
   - nom
   - adresse
   - email
   - telephone
   
 - Produit : 
   - Libelé
   - codeProduit
   - prix
   - disponibilité
   - nombreDePieces
   - ville
   - service {'location','achat'}
   
 - Commande :
   - client
   - produit[]
   - quantiteProduit
   - numeroCommande
   - dateCommande
 
- Facture :
  - numeroCommande
  - montantFacture
  - modePaiement
  - dateFacturation


### Fonctionnalités
 - Enregistrer un client
 - Enregistrer les commandes
 - Editer une facture
 - Enregistrer un Produit
 - Afficher les produits 
 - Afficher les clients
 - Modifier un client
 - Modifier un produit
 - Enregistrer les paiements
 - Supprimer un (client, factures ...)
 - Acheter un produit
 - Louer un produit 
 - Vendre un produit
 - Comparer les prix
 - Imprimer les statistiques
