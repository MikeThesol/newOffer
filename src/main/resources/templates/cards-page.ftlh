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
<table>
    <tr>
        <td><h3>id</h3></td>
        <td><h3>Вопрос</h3></td>
    </tr>
<#list cards as card>
    <tr>
        <td>${card.id}</td>
        <td><a href="/card/${card.id}">${card.title}</a></td>
    </tr>

</#list>
</table>
</body>
</html>