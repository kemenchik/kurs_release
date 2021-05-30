<#import "components/page.ftlh" as page>

<@page.page>
    <div class="container">
        <#list comments as comm>
            <form action="/admin/comments" method="post">
                <div>
                    ${comm.text}
                </div>
                <div>
                    Включен :<input type="hidden" value="${comm.getId()}" name="reviewId">
                    <input type="checkbox" ${comm.enabled?string("checked", "")} name="enabled">
                    
                </div>
                <button type="submit"> Сохранить </button>
            </form>
        </#list>
    </div>
</@page.page>