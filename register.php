<?php

require "init.php";

$name="Kjell";
$password="1234";
$contact="000000";
$country="Sweden";

$sql_query = "insert into users values('$name', '$password', '$contact', '$country');";

if(mysqli_query($connection, $sql_query))
{
	echo "Data inserted";


} else {
	echo "Data was not inserted correctly";
}



?>