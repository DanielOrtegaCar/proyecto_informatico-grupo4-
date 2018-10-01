<?php 
header( 'Content-Type: text/html;charset=utf-8' );


$hostname = "http://bdd.inf.udec.cl/";
$database = "proyinf4";
$username = "proyinf4";
$password = "chiloteql0";


function ejecutarSQLCommand($commando){
 
 $hostname = "bdd.inf.udec.cl";
$database = "proyinf4";
$username = "proyinf4";
$password = "chiloteql0";
 $mysqli = new mysqli($hostname, $username, $password, $database);

/* check connection */
if ($mysqli->connect_errno) {
    printf("Connect failed: %s\n", $mysqli->connect_error);
    exit();
}

if ( $mysqli->multi_query($commando)) {
     if ($resultset = $mysqli->store_result()) {
    	while ($row = $resultset->fetch_array(MYSQLI_BOTH)) {
    		
    	}
    	$resultset->free();
     }
    
   
}

$mysqli->close();
}



function getSQLResultSet($commando){
 
 $mysqli = new mysqli($hostname, $username, $password, $database);
  
/* check connection */
if ($mysqli->connect_errno) {
    printf("Connect failed: %s\n", $mysqli->connect_error);
    exit();
}

if ( $mysqli->multi_query($commando)) {
	return $mysqli->store_result();
	
     
    
   
}



$mysqli->close();
}


?>
