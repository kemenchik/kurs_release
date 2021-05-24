<#import "./components/page.ftlh" as page>

<@page.page>

    <div class="container">
        <div style="margin: 30px 0"><h2>${employee.firstName} ${employee.secondName}</h2></div>
        <form method='post' action="/doctors/${employee.id}/register" style="border: none">
            <div style="margin: 30px 0"><h4><label><b>Выберите дату записи</b></label></h4></div>

            <input type="date" name="date" width="300px" height="300px">
            <div style="margin: 30px 0;">
                <input type="submit" value="Отправить">
            </div>
        </form>
    </div>

</@page.page>