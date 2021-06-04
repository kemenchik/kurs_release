<#import "components/page.ftlh" as page>

<@page.page>
    <div class="container">
        <#list employees as el>
            <div>
                <h2>${el.firstName} ${el.secondName}</h2>
                <h3>${el.profession}</h3>
                <h4>${el.details}</h4>
            </div>
        </#list>
        <div style="margin: 30px 0">
            Добавить нового врача
        </div>
        <div style="margin: 15px 0">
            <form action="/admin/doctors" method="post">
                <label>
                    Имя
                    <input type="text" name="firstname">
                </label>
                <label>
                    Фамилия
                    <input type="text" name="secondname">
                </label>
                <label>
                    Кабинет
                    <input type="text" name="cabinet">
                </label>
                <label>
                    Характеристика
                    <input type="text" name="details">
                </label>
                <label>
                    Профессия
                    <input type="text" name="profession">
                </label>
                <button type="submit">Добавить</button>
            </form>
        </div>
    </div>
</@page.page>