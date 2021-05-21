<#import "./components/page.ftlh" as p>
<#include "./components/security.ftlh">

<@p.page>
    <div class="container" style="display: flex; flex-wrap: wrap">
        <#list doctors as doctor>
            <div style="width: 25%; height: 200px; border: #6c7279 2px solid; border-radius: 30px; padding: 20px; margin: 30px">
                <div>${doctor.firstName}</div>
                <div>${doctor.secondName}</div>
                <a href="doctors/${doctor.getId()}">gogogo</a>
            </div>
        </#list>
    </div>
</@p.page>