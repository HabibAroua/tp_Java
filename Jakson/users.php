<?php
	$host='localhost';
	$dbname='test';
	$username='root';	
	$password	='';	
	try
	{	
        $conn=new PDO("mysql:host=$host;	dbname=$dbname",$username,$password);
	    echo '<script> alert("Bienvenue cher client"); </script>';			
	}	
    catch(PDOException	$pe)	
	{							
		echo "connexion	a	la	base	a	echouee";
	}
	
	function getUsers()
	{
		$T=array();
		$sql="select * from users";
        global $conn;
        $res=$conn->query($sql);
		$i=0;
		$n=0;
        while($tab=$res->fetch(PDO::FETCH_NUM))
        {
            $T[$i]=$exampleArray = array('id'=>$tab[0]." ",'firstname'=>$tab[1]." ",'lastname'=>$tab[2],);
	 		$n=$i++;
	 	}
	 	return json_encode($T);
	}
	
	echo getUsers();
?>