# Resume POO

### Objets et Classes

Théorie : Les objets sont des instances de classes, qui définissent les caractéristiques et comportements communs à un ensemble d'objets.

Exemple de code :
```java
// Définition de la classe "Voiture"
class Voiture {
    String marque;
    String modele;

    void demarrer() {
        System.out.println("La voiture démarre !");
    }
}

// Création d'un objet "voiture1" de type "Voiture"
Voiture voiture1 = new Voiture();
voiture1.marque = "Toyota";
voiture1.modele = "Corolla";
voiture1.demarrer(); // Affiche "La voiture démarre !"
```

### Encapsulation

Théorie : L'encapsulation regroupe les données et les méthodes associées dans une classe, limitant leur accès depuis l'extérieur.

Exemple de code :
```java
class CompteBancaire {
    private double solde; // L'attribut "solde" est privé

    public void deposer(double montant) {
        solde += montant;
    }

    public double consulterSolde() {
        return solde;
    }
}

CompteBancaire compte1 = new CompteBancaire();
compte1.deposer(1000);
double soldeActuel = compte1.consulterSolde();
```

### Abstraction

Théorie : L'abstraction représente les caractéristiques essentielles d'un objet en ignorant les détails non pertinents, en utilisant des classes abstraites ou des interfaces.

Exemple de code :
```java
// Classe abstraite "Forme" avec une méthode abstraite "calculerSurface"
abstract class Forme {
    abstract double calculerSurface();
}

// Classe "Rectangle" héritant de "Forme"
class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double calculerSurface() {
        return longueur * largeur;
    }
}

Rectangle rectangle1 = new Rectangle(5, 3);
double surface = rectangle1.calculerSurface();
```

### Héritage

Théorie : L'héritage permet de créer de nouvelles classes (sous-classes) en utilisant les caractéristiques d'une classe existante (superclasse).

Exemple de code :
```java
// Classe de base "Animal"
class Animal {
    void parler() {
        System.out.println("Je suis un animal.");
    }
}

// Sous-classe "Chien" héritant de "Animal"
class Chien extends Animal {
    @Override
    void parler() {
        System.out.println("Je suis un chien.");
    }
}

Chien monChien = new Chien();
monChien.parler(); // Affiche "Je suis un chien."
```

### Polymorphisme

Théorie : Le polymorphisme permet à un objet d'adopter plusieurs formes, en traitant des objets de différentes classes de manière interchangeable.

Exemple de code :
```java
class Forme {
    void dessiner() {
        System.out.println("Je suis une forme.");
    }
}

class Cercle extends Forme {
    @Override


    void dessiner() {
        System.out.println("Je suis un cercle.");
    }
}

class Triangle extends Forme {
    @Override
    void dessiner() {
        System.out.println("Je suis un triangle.");
    }
}

Forme[] formes = new Forme[2];
formes[0] = new Cercle();
formes[1] = new Triangle();

for (Forme forme : formes) {
    forme.dessiner(); // Affiche "Je suis un cercle." puis "Je suis un triangle."
}
```

### Surcharge

Théorie : La surcharge permet de définir plusieurs versions d'une même méthode ou d'un même opérateur dans une classe.

Exemple de code :
```java
class Calculatrice {
    int ajouter(int a, int b) {
        return a + b;
    }

    double ajouter(double a, double b) {
        return a + b;
    }
}

Calculatrice calculatrice = new Calculatrice();
int resultat1 = calculatrice.ajouter(2, 3); // Résultat : 5
double resultat2 = calculatrice.ajouter(2.5, 3.7); // Résultat : 6.2
```

### Getters et Setters

Théorie : Les getters et setters sont utilisés pour accéder (get) et modifier (set) les valeurs des attributs d'un objet.

Exemple de code :
```java
class Personne {
    private String nom;
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

Personne personne1 = new Personne();
personne1.setNom("Jean");
String nomPersonne1 = personne1.getNom(); // Résultat : "Jean"
```

