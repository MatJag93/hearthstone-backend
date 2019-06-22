<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HS-Application</title>
    <style>
        body, html {
            height: 100%;
            margin: 0;
        }

        .bg {
            background-image: url("https://images5.alphacoders.com/555/555053.jpg");

            height: 100%;

            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }

        div#navbar_div li {
            color: #FFC66D;
            position: relative;
            top: 100px;
            text-align: center;
            font-size: x-large;
        }
    </style>
</head>
<body>

<div class="bg">
    <div id="navbar_div">
        <li>/decks - pokazuje wszystkie talie ( GET )</li>
        <li>/decks - tworzy nowa talie o zadanym body ( POST )</li>
        <li>/decks/{id} - pokazuje konkretna talie ( GET )</li>
        <li>/decks/{id} - usuwa konkretna talie ( DELETE )</li>

        <li>/cards - pokazuje wszystkie karty ( GET )</li>
        <li>/cards - tworzy konkretna karte o zadanym body ( POST )</li>
        <li>/cards/{id} - pokazuje konkretna karte ( GET )</li>
        <li>/cards/{id} - usuwa konkretna karte ( DELETE )</li>
    </div>
</div>


</body>
</html>
