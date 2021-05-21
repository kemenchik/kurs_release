<#import "components/page.ftlh" as p>

<@p.page>
    <div class="container">
        <h2 style="margin: 30px 0;">Войти</h2>
        <form action="/login" method="post">
            <div class="imgcontainer">
                <img src="images/img_avatar2.png" alt="Avatar" class="avatar">
            </div>
            <div class="container">
                <label><b>Логин</b></label>
                <input type="text" placeholder="Введите логин" name="username" required>

                <label><b>Пароль</b></label>
                <input type="password" placeholder="Введите пароль" name="password" required>

                <input type="submit">Войти</input>
            </div>

            <div class="container" style="background-color:#f1f1f1">
                <a href="/main"><button type="button" class="cancelbtn">Cancel</button></a>
                <span class="psw"><a href="/registration">Зарегистрироваться</a></span>
            </div>
        </form>
    </div>
</@p.page>