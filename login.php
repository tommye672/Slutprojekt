<?php

require "init.php";

$name="Kjell";
$password="1234";
$contact="000000";
$country="Sweden";

$sql_query = "select name from users where name like '$name' and password like '$password';";


$result=mysqli_query($connection, $sql_query);

if(mysqli_num_rows($result)>0)
{
	$row = mysqli_fetch_assoc($result);
	$name= $row["name"];
	echo "$name";
} else {
	echo "Error: User not found";
}


?>