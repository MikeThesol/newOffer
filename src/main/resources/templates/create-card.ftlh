<!DOCTYPE html>
<html>
<head>
    <title>newOffer</title>
    <link type="text/html" rel="icon" href="images/icoMoney.ico">
</head>
<body>
<a href="/" ><img src="/images/moneyIcon64.png"> home</a> |
<a href="/interview">Собеседования</a> |
<a href="/about">о нас</a><br><br><br>
<form method="post" action="/create/card">
    Вопрос: <input type="text" name="title" /><br>
    Описание:<br> <textarea name="description"></textarea><br>
    <select name="language">
        <#list languages as language>
            <option value="${language.id}">${language.name}</option>
        </#list>
    </select>

    <br/>
    <input type="submit" value="Создать карточку" />
</form>
</body>
</html>