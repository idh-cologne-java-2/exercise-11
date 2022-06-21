Softwaretechnologie: Java 2

# Übung 11


Klonen Sie dieses Repository direkt in Eclipse und importieren Sie das Maven-Projekt. Legen Sie einen neuen Branch an, den Sie nach Ihrem GitHub-Benutzernamen benennen.


## Aufgabe 1
Im Unterverzeichnis `src/main/resources` finden Sie eine Datei `wine.csv`, und in der `pom.xml` ist die Bibliothek `commons-csv` bereits hinzugefügt. Bei der Datei handelt es sich um eine Sammlung von Weißweinen, die neben diversen chemischen Eigenschaften (Restsüße, Alkoholgehalt etc.) auch eine Qualitätsstufe enthält. Eine CSV-Datei ist im Kern eine Tabelle, in der die einzelnen Spalten durch Komma und die Zeilen durch einen Zeilenumbruch getrennt sind. Die Bibliothek `commons-csv` ist dazu gedacht, solche Dateien zu verarbeiten ([Hier](https://commons.apache.org/proper/commons-csv/user-guide.html) geht es zum User guide, die API Dokumentation gibt es [hier](https://commons.apache.org/proper/commons-csv/apidocs/index.html)). 

Verwenden Sie die Bibliothek, um für jede Spalte den Durchschnitt zu berechnen. Im Gegensatz zu früheren Aufgaben gibt es nun keine Rumpfimplementierung mehr. Sie müssen also eine neue Klasse anlegen, die eine `main`-Methode enthält, und dann eben den Durchschnitt der Spalten berechnet. Es handelt sich dabei um eine Aufgabe, die sich regelmäßig stellt, wenn man mit Daten arbeitet (auch wenn man nicht mit Weinen arbeitet ...).

Hinweis: In der vorliegenden Datei enthalten alle Spalten Dezimalzahlen, d.h. sie können in einen passenden numerischen Datentyp konvertiert werden. Im echten Leben müsste man natürlich noch berücksichtigen, dass manche  Spalten auch Text- oder andere Daten beinhalten können (für die man natürlich auch keinen Durchschnitt berechnen kann).


## Aufgabe 2

Achtung: In dieser Aufgabe müssen Sie nichts in Java programmieren. Nehmen Sie sich einen Stapel normale Spielkarten (z.B. Skatkarten). Mischen Sie sie gründlich. 

Anschließend sollen sie den Kartenstapel wieder sortieren *und dabei dokumentieren wie sie vorgehen*. Die Dokumentation sollte sich (in Stichpunkten) auf die wichtigen Aspekte konzentrieren, z.B. Wann bilden Sie temporäre Zwischenstapel? Wie viele Karten haben Sie gleichzeitig offen vor sich (Hand/Tisch)? 
Diese Dokumentation speichern Sie als Textdatei (.txt) im Verzeichnis `src/main/resources` ab und committen sie wie üblich. 

Die Sortierung sollte dabei nach Kartenwert erfolgen, also von unten nach oben: 7, 8, 9, 10, Bube, Dame, König, Ass. Bei den Farben gilt von unten nach oben: ♦️♥️♠️♣️.

Hintergrund: Sortieralgorithmen sind ein Klassiker der Algorithmenkunde und es gibt mehrere Möglichkeiten wie man dabei im Computer vorgehen kann. Objekte sortieren ist Wir sprechen darüber in der nächsten Sitzung.

----

Wenn Sie fertig sind, committen Sie alle Ihre Änderungen, und pushen Sie den neuen Branch auf das remote namens `origin` (= GitHub). 