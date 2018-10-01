<?php include ('functions.php');
$nombres=$_GET['nombres'];
$pass=$_GET['password'];


//http://localhost/webservice/registro.php?nombres=Julio%20Zapata&pass=12345678
ejecutarSQLCommand("INSERT INTO  `Usuario` (nombre,  password) VALUES ('$nombres' , '$pass')

 ON DUPLICATE KEY UPDATE `nombre`= '$nombres', `password` = '$pass';");
 ?>