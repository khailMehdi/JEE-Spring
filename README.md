<h1>Inversion de contrôle et Injection des dépendances</h1>
<p>1. Créer l'interface IDao avec une méthode getDate</p>
<img src="src/main/java/Image/Capture.PNG" alt="IDoa.java">
<p>2. Créer une implémentation de cette interface Version Base donne</p>
<img src="src/main/java/Image/Capture1.PNG" alt="DoaImpl.java">
<p>3. Créer une implémentation de cette interface Version Web service</p>
<img src="src/main/java/Image/Capture2.PNG" alt="DoaImpl.java">
<p>3. Créer l'interface IMetier avec une méthode calcul</p>
<img src="src/main/java/Image/Capture3.PNG" alt="IMetier.java">
<p>4. Créer une implémentation de cette interface en utilisant le couplage faible</p>
<img src="src/main/java/Image/Capture4.PNG" alt="IMetierImpl.java">
<p>5. Faire l'injection des dépendances :</p>
<ul>
  <li>Par instanciation statique</li>
  <img src="src/main/java/Image/Capture5.PNG" alt="Main.java">
  <li>Par instanciation dynamique</li>
  <img src="src/main/java/Image/Capture6.PNG" alt="IMetierImpl.java">
  <li>En utilisant le Framework Spring Version XML et Annotations</li>
</ul>



 





 
 
