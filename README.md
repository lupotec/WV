# Maak een nieuw leeg project aan.
Empty Views Activity,<br>
naam project,<br>
Language= Java,<br>
API24 Nougat Android 7,  <br>
Groovy DSL

# Wijzig volgende bestanden om een webview te genereren.
<a href='https://github.com/lupotec/WV/blob/main/activity_main.xml'>activity_main.xml</a><br>
<a href='https://github.com/lupotec/WV/blob/main/AndroidManifest.xml'>AndroidManifest.xml</a><br>
<a href='https://github.com/lupotec/WV/blob/main/MainActivity.java'>MainActivity.java</a> -> Pas de url aan

# Koppel je app aan <a href='https://console.firebase.google.com'>https://console.firebase.google.com</a> om push notifications te verkrijgen/versturen.
Maak een leeg project aan in de online Firebase console en geef het een naam.<br>
Open je Android project en ga naar tools > Firebase > Cloud Messaging > Set up Firebase Cloud Messaging > Connect your app to Firebase > Connect to Firebase<br><br>
Add project indien er nog geen bestaat. Koppel je Android app aan het Firebase project.<br>
Add FCM to your project. (Tools > Firebase) Dit zal je build.gradle (project en app) bestanden wijzigen.<br>
Ga naar je Firebase console en klik op het tandwielje bij je project.<br>
Scroll naar onder en download het google-services.json bestand.<br>
Plaats het google-services.json bestand in de app dir van je Android project.<br>
