<!DOCTYPE html>
<html>
<head>
    <title>newOffer</title>
    <link type="text/html" rel="icon" href="images/icoMoney.ico">
</head>
<body>
<a href="/" ><img src="/images/moneyIcon64.png"> home</a> |
<a href="/interview">Собеседования</a> |
<a href="/about">о нас</a><br><br>
<#list cards as card>
    <div>
        <p><b>${card.title}</b> | <a href="/card/${card.id}">Ответ...</a></p>
    </div>
</#list>
</body>
</html>