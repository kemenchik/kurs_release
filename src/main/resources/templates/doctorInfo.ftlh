<#import "components/page.ftlh" as p>

<@p.page>
    <div class="container">

        <h1 style="margin: 0.25rem 0;">
            ${employee.firstName}
            ${employee.secondName}
        </h1>
        <h2 style="margin: 0.25rem 0;">
            ${employee.cabinet} кабинет
        </h2>
        <div style="width: 100%; height: 300px; border: 2px solid black; border-radius: 30px; padding: 30px; margin-bottom: 0.125rem;  font-size: 33px;">
            ${employee.details}
        </div>
        <div style="width: 100%; border: 2px solid black; border-radius: 30px; padding: 30px; margin-bottom: 0.5rem;">
            <div class="container" style="display: flex; flex-wrap: wrap; color: black;">
                <div style="width: 33.33333%; margin-bottom: 20px; padding: 20px">
                    <img src="../images/proj1.jpg" width='200px' height="200px"/>
                    <h2>Исправление улыбки</h2>
                </div>
                <div style="width: 33.33333%; margin-bottom: 20px; padding: 20px">
                    <img src="../images/proj2.jpg" width='200px' height="200px"/>
                    <h2>Восстанавливающие работы</h2>
                </div>
                <div style="width: 33.33333%; margin-bottom: 20px; padding: 20px">
                    <img src="../images/proj4.jpg" width='200px' height="200px"/>
                    <h2>Восстанавливание эмали</h2>
                </div>
            </div>
        </div>
        <a href="/doctors/${employee.id}/register"><button style="float: right" class="btn btn--red">
            Записаться
        </button></a>
        <#if Session.SPRING_SECURITY_CONTEXT??>
            <form method='post' action="/doctors/${employee.id}" style="margin-top: 75px;">
                <textarea name='text' style="width: 100%" rows='10' placeholder="Оставьте свой отзыв"></textarea>
                <p><button class="btn btn--red">
                        Отправить
                    </button></p>
            </form>
        </#if>
    </div>
</@p.page>