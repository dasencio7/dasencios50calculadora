<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora de Interés Simple</title>
</head>
<body>
    <h1>Calculadora de Interés Simple</h1>
    <form action="calcular" method="post">
        Capital: <input type="number" name="capital" required><br>
        Tasa de Interés (%): <input type="number" name="tasa" required><br>
        Número de Años: <input type="number" name="años" required><br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
