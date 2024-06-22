<!DOCTYPE html>
<html>
<head>
    <title>newOffer</title>
    <link type="text/html" rel="icon" href="/images/icoMoney.ico">
</head>
<body>
<a href="/" ><img src="/images/moneyIcon64.png"> home</a> |
<a href="/interview">Собеседования</a> |
<a href="/about">о нас</a><br><br><br>
<b>${card.title}</b><br>
${card.description?no_esc}
<br>
<h2>Доступные видео для данного вопроса:</h2><br>
<#list videos as video>
    <a href="${video.url}" target="_blank">${video.post}</a>
</#list>
</body>
</html>