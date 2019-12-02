package ProgramCafenea;

/*
Intr-o cafenea pot exista 2 tipuri de bauturi: sucuri si cafele. Orice bautura are un nume si un pret;
Un suc are in plus un procent de zahar iar o cafea un procent de cofeina;
Doua bauturi sunt considerate egale daca au acelasi nume;
In cafenea nu pot exista doua bauturi identice;
Se cere realizarea unei aplicatii care gestioneaza o singura cafenea;
La incarcarea unei bauturi date deja de la tastatura, exista o exceptie NameAlreadyExistsException.
Un fir de executie care afiseaza cate bauturi exista in cafenea.

tema:
Thread: o data la 30 sec se afiseaza o bautura aleatoare;

Primul caz de utilizare:
adaugarea unui suc.     ADD_S <nume> <pret> <num>
adaugarea unei cafele.  ADD_C <nume> <pret> <num>
afisare bauturi         PRINT
afisare sucuri          PRINT_S
scote bautua            REMOVE <nume>
Iesire                  EXIT

Pasi:
Figuram entitatile aplicatiei : Bautura, Suc, Cafea, Cafenea. NameAlreadyExistsException, Main;

Cafenea (has a) bautura;
Suc (is a) bautura;
Cafea (is a) bautura;

Ordinea claselor abordate: Bautura, Suc, Cafea, Cafenea, NameAlreadyExistsException, Ex.
*/