<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Figuras</title>
</head>

<body>
    <?php
        require_once 'lib/Figuras.php';
        require_once 'lib/AreaFilter.php';

        function showHome(){
    ?>
            <h1>Figuras</h1>
            <a href="lista">Ver todas las figuras geométricas</a>
            <form action="filtro/" method="GET">
                <label for="area">Buscar figuras con área menor a: </label>
                <input id="area" type="number" name="area" placeholder="Introduzca área...">
                <button type="submit">Buscar</button>
            </form>
    <?php
    }
    function showLista(){
        

        // instancia la clase Figuras para acceder a las figuras
        $figuras = new Figuras();

        echo "<h1>Listado de figuras</h1> <ul>";

        foreach ($figuras->getAll() as $figura) {
            echo "<li>" .
                $figura->ToString() .
                
                " | <a href='verFigura/" . $figura->getId() . "'>VER </a>" .
                "</li>";
        }

            echo "</ul><a href='./'>Volver</a>";
    }
    function showFiltro($area){
        var_dump($area);  
        $area = $_GET['area'];      
        
        // instancio la clase Figuras para trabajar con las figuras del sistema
        $figuras = new Figuras();



echo "Las figuras con area menor a     $area   son: <ul>";
foreach($figuras->getBy(new AreaFilter($area)) as $figura) {
    echo "<li>" . 
            $figura->ToString() . 
            " | <a href='filtro/". $figura->getId() . "'>VER </a>" .
         "</li>";
}
echo "
    </ul>
    <a href='../'>Volver</a>";
    }
    function showVerFigura($id){
        

// instancia la clase Figuras para acceder a las figuras
$figuras = new Figuras();

// obtiene la figura según el ID pasado como parámetro

$figura = $figuras->get($id);

// imprime el detalle de la figura
echo 
    "<ul>
        <li><strong>ID: </strong>" . $figura->getId() . "</li>
        <li><strong>Tipo: </strong>" . $figura->getName() . "</li>
        <li><strong>Perímetro: </strong>" . $figura->getPerimetro() . "</li>
        <li><strong>Área: </strong>" . $figura->getArea() . "</li>
    </ul>
     <a href='../'>Volver</a>";
    }
            ?>

</body>

</html>