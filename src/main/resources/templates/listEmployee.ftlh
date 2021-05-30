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
    </div>
</@page.page>