<?php
include('functions.php');
$nombre=$_GET["nombre"];
$pass=$_GET["pass"];



if($resultset=getSQLResultSet("SELECT * FROM `Usuario` WHERE nombre='$nombre' AND password = '$pass'")){
	while ($row = $resultset->fetch_array(MYSQLI_NUM)){
		echo json_encode($row);
	}
}

?>


