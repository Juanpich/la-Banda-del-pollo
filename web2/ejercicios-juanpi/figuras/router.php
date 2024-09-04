<?php
require_once 'seccion.php';
    if(!empty($_GET['action'])){
        $action = $_GET['action'];
    }else{
        $action = 'home';
    }
    $param = explode('/', $action);
    switch ($param[0]) {
        case 'home':
            showHome();
            break;
        case'lista':
            showLista();
            break;
        case'filtro':
            showFiltro($param[1]);
            break;
        case'verFigura':
            showVerFigura($param[1]);
            break;
        default:
            echo "Error 404";
            
            break;
    }