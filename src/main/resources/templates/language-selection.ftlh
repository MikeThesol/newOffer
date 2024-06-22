<!DOCTYPE html>
<html>
<head>
    <title>newOffer</title>
    <link type="text/html" rel="icon" href="/images/icoMoney.ico">
</head>
<body>
<a href="/" ><img src="/images/moneyIcon64.png"> home</a> |
<a href="/interview">Собеседования</a> |
<a href="/about">о нас</a><br><br>
<h1>Доступные языки программирования</h1>
<#list languages as language>
    <div>
        <a href="/language/${language.name}"><p><b>${language.name}</b></p></a>
    </div>
</#list>
</body>
</html>