<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Welcome Page!</title>
</head>
<#assign welcome = "ciao ${user}">
<#assign messaggio = "${message}"><body>
<h1>${welcome + messaggio}</h1>
</body>
</html>
