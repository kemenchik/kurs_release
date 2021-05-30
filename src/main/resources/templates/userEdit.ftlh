<#import "components/page.ftlh" as page>

<@page.page>
    <div class="container">
        <h2>${user.username}</h2>
        <#list user.roles as role>
            <ul>
                <li>
                    <label>Роль: ${role.name}</label>
                </li>
            </ul>
        </#list>
        <#list reg as regs>
            <form action="/admin/users" method="post">
                <ul>
                    <li>
                        <h5>Дата: ${regs.date}</h5>
                        <h5>Врач: ${regs.doctor.firstName} ${regs.doctor.secondName}</h5>
                        Включен :<input type="checkbox" ${regs.enabled?string("checked", "")} name="enabled">
                        <input type="hidden" name="regId" value="${regs.id}">
                        <button type="submit" style="background-color: red">Сохранить</button>
                    </li>
                </ul>
            </form>
        </#list>

    </div>
</@page.page>