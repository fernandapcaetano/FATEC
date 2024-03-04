<?php
$carros = array('Fusca' => array(   'ano'        => 1977,
                                    'marca'      => 'Volkswgem',
                                    'acessórios' => 'Rádio AM'),

                'Kombi' => array(   'ano'        => 1975,
                                    'marca'      => 'Volkswagen',
                                    'acessórios' => 'pintura saia e blusa'),              

                'Belina' => array(  'ano'        => 1981,
                                    'marca'      => 'Ford',     
                                    'acessórios' => 'Rádio AM'),  
             
);
echo nl2br ($carros['Kombi']['acessórios']."\n");

foreach ($carros as $carro => $value) {
    echo nl2br ("Nome: " .$carro);
    echo nl2br (" Ano: " .$value['ano']);
    echo nl2br (" Marca: " .$value['marca']);
    echo nl2br (" Acessórios: " .$value['acessórios']. "\n");
}
?>