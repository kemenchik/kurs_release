<#import "components/page.ftlh" as p>

<@p.page>
    <div class="container">
        <h2 style="margin: 30px auto;">Войти</h2>
        <form action="/registration" method="post">
            <div class="container">
                <label><b>Имя</b></label>
                <input type="text" placeholder="Введите логин" name="firstname" required>
                <label><b>Фамилия</b></label>
                <input type="text" placeholder="Введите логин" name="secondname" required>
                <label><b>Логин</b></label>
                <input type="text" placeholder="Введите логин" name="username" required>
                <label><b>Пароль</b></label>
                <input type="password" placeholder="Введите пароль" name="password" required>
                <input type="submit" style="margin-bottom: 15px" value="Зарегистрироваться">
            </div>
            <div class="container" style="background-color:#f1f1f1">
                <a href="/main"><button type="button" class="cancelbtn">На главную страницу</button></a>
                <span class="psw"><a href="/login">Логин</a></span>
            </div>
        </form>
    </div>
</@p.page>