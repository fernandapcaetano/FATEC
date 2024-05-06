<?php
    if(count($_POST) > 0){
        if(empty($_POST['nome']) or empty($_POST['senha'])){
            echo nl2br("Complete todos os campos\n") ;
        }
        if(empty($_POST['g-recaptcha-response'])){
            echo nl2br("Resolva o captcha");
        }
        if(isset($_POST['g-recaptcha-response']) and !empty($_POST['g-recaptcha-response'])){

            $secret = "6LeeedMpAAAAACoNyYUCQudXRpDI_w7UOdYiZz00";
            $response = file_get_contents('https://www.google.com/recaptcha/api/siteverify?secret='. $secret .'&response='. $_POST['g-recaptcha-response']);
            $data=json_decode($response);

            if($data->success){
                echo "Dados enviados";
            } else{
                echo "Tente novamente";
            }

        }
    }
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Demo do reCaptcha</title>

    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
</head>
<body>
    <h1>Login</h1>   

    <form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        <input type="text" name="nome">
        <input type="password" name="senha">

        <div class="g-recaptcha" data-sitekey="6LeeedMpAAAAAC__AggOTm77PL63HlWrh4Ap9NDa"></div>

        <input type="submit" value="Entrar">
    </form>

</body>
</html>