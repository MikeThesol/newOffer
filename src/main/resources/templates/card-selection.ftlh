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
<#list cards as card>
    <div>
        <a href="/card/${card.id}">${card.title}</a><br><br>
    </div>
</#list>
</body>
</html>