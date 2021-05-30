<#import "components/page.ftlh" as page>

<@page.page>
    <div class="container">
        <#list users as el>
            <a href="users/${el.username}">
                <button>
                    ${el.username}
                </button>
            </a>
        </#list>
    </div>
</@page.page>