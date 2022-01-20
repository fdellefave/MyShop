<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ecco il tuo prodotto:</title>
</head>
<#assign saluto = "Benvenuto nel corso">
<body>
    <h1>${prodotto.nome}</h1>
    <p>${prodotto.prezzo}</p>
    <p>${prodotto.categoria}</p>

    <p>${saluto}</p>
</body>
</html>
