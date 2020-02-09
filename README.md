Cars Salon project in Java

Exercise :

Napisz program obsługi salonu samochodowego.

Jesteś właścicielem swojego salonu samochodowego, zaimplementuj obsługę kupowania nowego samochodu przez klienta (użytkownika). Użytkownik powinien posiadać określoną ilość pieniędzy, którą podaje na samym początku programu. Względem tego powinien otrzymać listę kilku samochodów w odpowiednim przedziale cenowym (w wersji standard). Po wybraniu konkretnego modelu pojazdu powinien pokazać się kreator samochodu. Użytkownik powinien mieć do wyboru (kolejność wyboru tych parametrów może być dowolna):

kolor - podzielony na kolory standardowe (darmowe) oraz kolory premium (kosztujące dodatkowo)
rodzaj nadwozia - dla uproszczenia przyjmijmy iż wszystkie samochody standardowo są sedanami (darmowe) oraz istnieją jeszcze wersje pick-up (2 tys zl), hatchback (1 tys zl) i kombi (1 tys zł)
tapicerkę - dla uproszczenia przyjmijmy iż wszystkie samochody mają welurową tapicerkę (darmowa) oraz istnieje jeszcze tapicerka skórzana (1 tys zł) oraz tapicerka skórzana pikowana (2 tys zł)
rodzaj paliwa - dla uproszczenia przyjmijmy iż wszystkie samochody są benzynowe (darmowa) oraz istnieje możliwość wybrania silnika diesla (10 tys zł) oraz hybrydy (15 tys zł)
Podczas wyboru tych parametrów powinno nastąpić aktywne sprawdzanie zawartości portfela:

w momencie przekroczenia budżetu powinien pojawić się komunikat o niemożliwości wybrania innych parametrów jak standardowe - UWAGA: gdy użytkownik jednak nadal będzie chciał wybrać coś co jest za gotówkę powinniśmy poprosić go o nie ponawianie tej akcji. W momencie gdy użytkownik jednak wybierze 3 razy opcję niedostępną dla niego powinniśmy takiego delikwenta wyprosić z naszego salonu
powinno istnieć cofnięcie się do poprzedniego parametru tak by użytkownik mógł zmienić swój wybór - UWAGA: przy zmianie wyboru powinno nastąpić ponowne zweryfikowanie zawartości portfela
Po wybraniu wszystkich parametrów powinniśmy pokazać saldo naszego portfela oraz nowo zakupiony samochód ze wszystkimi opcjami (prosty println).
