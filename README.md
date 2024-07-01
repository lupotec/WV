# Maak een nieuw leeg project aan.
Empty Views Activity,<br>
naam project,<br>
Language= Java,<br>
API24 Nougat Android 7,  <br>
Groovy DSL

# Wijzig volgende bestanden om een webview te genereren.
*<a href='https://github.com/lupotec/WV/blob/main/activity_main.xml'>activity_main.xml</a><br>
-> recht bovenaan code<br>
*<a href='https://github.com/lupotec/WV/blob/main/AndroidManifest.xml'>AndroidManifest.xml</a><br>
*<a href='https://github.com/lupotec/WV/blob/main/MainActivity.java'>MainActivity.java</a><br>
-> Pas de url aan<br>
-> let op de juiste package name bovenaan<br>

# Koppel je app aan <a href='https://console.firebase.google.com'>https://console.firebase.google.com</a> om push notifications te verkrijgen/versturen.
*Maak een leeg project aan in de online Firebase console en geef het een naam.<br>
*Open je Android project en ga naar <b>tools > Firebase > Cloud Messaging > Set up Firebase Cloud Messaging > Connect your app to Firebase > Connect to Firebase</b><br><br>
*Add project indien er nog geen bestaat. Koppel je Android app aan het Firebase project.<br>
*Add FCM to your project. (<b>Tools > Firebase</b>) Dit zal je build.gradle (project en app) bestanden wijzigen.<br>
*Ga naar je Firebase console en klik op het tandwielje bij je project.<br>
*Scroll naar onder en download het google-services.json bestand.<br>
*Plaats het google-services.json bestand in de app dir van je Android project.<br>

*maak de PushNotificationService.java file aan onder <b>app > java</b><br>
*wijzig de code in AndroidManifest.xml door de code in <a href='https://github.com/lupotec/WV/blob/main/AndroidManifest.xml_V2.0'>AndroidManifest.xml_V2.0</a><br>

*wijzig de code in Main_Activity.java door de code in <a href='https://github.com/lupotec/WV/blob/main/Main_Activity.java_V2.0'>Main_Activity.java_V2.0</a><br>

# Permissions vragen voor push notifications wanneer we de app installeren.
*Wanneer we de app gaan installeren willen we eerst toelating vragen om push notifications te versturen. Verwijder daarom eerst de app volledig van het device.<br>
<b>Home knop > Swipe van onder naar boven > blijf linkermuisknop ingedrukt houden op icoon boven de pagina > app info > uninstall > ok</b>.<br><br>
*Pas aan:<br>
# Test.
*Ga via de browser naar de pagina https://gridz.be/get.php?fcm=testcode&naam=ikzelf<br>
Je zal merken dat alle ontvangen GET variabelen worden weergegeven. Wanneer we de fcm-code of unieke app-code gaan opslaan, kan je naar dit specifiek toestel een push-notification sturen. <br><br>
*Ga naar je <a href='https://console.firebase.google.com'>Firebase console</a>.<br>
*Scroll in het linkermenu naar onderen en ga naar <b>Run > Messaging</b><br>
*Start een <b>new campain (Notifications)</b><br>
*Geef een notification title en een notification text. Image is niet verplicht.<br>
<b>send test message > Add FCM device token (die je hebt gekopieerd via de webpagina) en plak de token die > + > Test</b><br>
*In de linkerbovenhoek van je device, zie je nu een bolletje staan. Je hebt de melding ontvangen. Sleep naar onderen om te openen.<br>

