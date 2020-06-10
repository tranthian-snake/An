<?php
$paper = array('copier' => "Copier & Multipurpose",
                'inkjet' => "Inkjet Printer",
                'laser' => "Laser Printer",
                'photo' => "Photographic Paper");

foreach($paper as $itemm => $description )
    echo "$itemm: $description<br>";

?>