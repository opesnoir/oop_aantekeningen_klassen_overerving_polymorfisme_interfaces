# oop_aantekeningen_klassen_overerving_polymorfisme_interfaces

Abstraction, encapsulation, getters en setters
Abstraction is het destilleren en kaderen van code. Dit maakt de code eenvoudiger te lezen en te onderhouden.
Encapsulation is het afschermen code, zodat gebruikers niet zomaar zaken kunnen veranderen. Binnen Java hebben we afgesproken om attributen altijd private te maken en toegang te regelen via getters en setters.

Getters en Setters:
Een getter methode maakt data opvraagbaar. Je maakt een getter door naar Code > Generate > Getter te gaan.
Een setter methode gebruik je om een waarde in te stellen. Je maakt een setter door naar Code > Generate > Setter te gaan.
Gebruik alleen getters en setters die je daadwerkelijk nodig hebt.

Attributen en Access Modifiers
Private: Alleen binnen de klasse toegankelijk.
Public: Voor iedereen toegankelijk.
Protected: Toegankelijk binnen dezelfde package en subclasses.

Object- en Klassevariabelen
Objectvariabelen: Deze zijn aanpasbaar voor ieder object individueel.
Klassevariabelen: Deze behoren tot de klasse en zijn voor alle objecten gelijk.
Final Keyword geeft aan dat een waarde na het toekennen van zijn eerste waarde niet meer veranderd kan worden.

Klassendiagram
+ betekent public
- betekent private
# betekent protected
  Onderstreept betekent constant (final)

- Klasse plaats je in de packadge model
- Launcher plaats je in de packadge controller

// stukken code
// de boolean returned true of false
System.out.printf("%s verdient %.2f per jaar en heeft %b recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus());
// hier maak je van de boolean een string en laat je hem "wel" teruggeven als de boolean true is, en "geen" als de boolean false is
System.out.printf("%s verdient %.2f per jaar en heeft %s recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus()? "wel": "geen"); 

