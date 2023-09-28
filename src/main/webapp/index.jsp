<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quest Game</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<h1><%= "Добро пожаловать в Квест игру \"НЛО\"" %>
</h1>
<br/>
Ты стоишь в космическом порту и готов подняться на борт
<br>
своего корабля. Разве ты не об этом мечтал? Стать капитаном
галактического судна с экипажем, который будет совершать подвиги под твоим командованием.
Так что вперед:
<h1><%= "Знакомство с экипажем" %>
</h1>
Когда ты поднялся на борт корабля, тебя поприветствовала девушка с черной папкой в руках:
- Здравствуйте командир! Я Зинаида - ваша помощница. Видите? Там в углу пьет кофе
наш штурман - сержант Перегарный Шлейф, под штурвалом спит наш бортмеханик - Черный Богдам,
А как обращаться к вам?
<br>
<br>
<form class="row g-3" action="/start">
    <div class="col-md-4">
        <input type="text" name="username" class="form-control" placeholder="Введите имя" aria-describedby="button-addon2" required>
        <br>
        <button class="btn btn-primary" type="submit" id="startButton">Начать игру</button>
    </div>
</form>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous">
</script>
</div>
</body>
</html>