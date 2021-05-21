<#import "components/page.ftlh" as p>

<@p.page>
    <div class="container" style="display: flex; flex-wrap: wrap">
        <#list reviews as review>
            <div style="width: 25%; height: 200px; border: #6c7279 2px solid; border-radius: 30px; padding: 20px; margin: 30px">
                ${review.text}
            </div>
        </#list>
    </div>
</@p.page>