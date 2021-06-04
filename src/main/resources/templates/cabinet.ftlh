<#import "components/page.ftlh" as p>

<@p.page>
    <div class="container" style="margin: 30px auto">
        <div>Ф.И:</div>
        <h1>${user.secondname} ${user.firstname}</h1>
        <div>Логин:</div>
        <h2>${user.username}</h2>
        <div>Записи:</div>
        <#list registers as reg>
            <h3>${reg.date.dayOfMonth}/${reg.date.monthValue} - ${reg.date.hour}:${reg.date.minute}</h3>
        <#else>
            <h3>Записей нет!</h3>
        </#list>
        <div>
            <form action="/logout" method="post" style="border: none; background-color: #de9f11;">
                <button style="background-color:transparent;">
                    <input type="submit" value="Выйти" style="background-color:transparent; border: none">
                </button>
            </form>
        </div>

    </div>
</@p.page>