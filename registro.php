<?php include ('functions.php');
$nombres=$_GET['nombres'];
$telefono=$_GET['tel'];
$pass=$_GET['pass'];

ejecutarSQLCommand("INSERT INTO  `Usuario` (nombre,  password) VALUES ('$nombres' , '$pass')

 ON DUPLICATE KEY UPDATE `nombres`= '$nombres', `contrasena` = '$pass';");
 ?>