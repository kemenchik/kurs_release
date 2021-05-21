<#import "components/page.ftlh" as p>

<@p.page>
    <#list employee as el>
    <div class="container">

        <h1 style="margin: 0.25rem 0;">

        </h1>
        <h2 style="margin: 0.25rem 0;">

        </h2>
        <div style="width: 100%; height: 300px; border: 2px solid black; border-radius: 30px; padding: 30px; margin-bottom: 0.125rem; ">
            otzyv
        </div>
        <div style="width: 100%; height: 300px; border: 2px solid black; border-radius: 30px; padding: 30px; margin-bottom: 0.5rem;">
            works
        </div>
        <button style="float: right" class="btn btn--red">
            Записаться
        </button>
        <#if Session.SPRING_SECURITY_CONTEXT??>
            <form method='post' action='' style="margin-top: 75px;">
                <textarea name='text' style="width: 100%" rows='10' placeholder="Оставьте свой отзыв"></textarea>
                <p><button class="btn btn--red">
                        Отправить
                    </button></p>
            </form>
        </#if>
    </div>
    </#list>
</@p.page>