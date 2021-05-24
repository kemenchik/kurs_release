<#import "./components/page.ftlh" as p>

<@p.page>
    <div class="container" style="display: flex; flex-wrap: wrap">
        <#list doctors as doctor>
            <div class="card_2">
                <img src="../images/img_avatar.jpg" alt="" style="width:100%">
                <h1>${doctor.firstName} ${doctor.secondName}</h1>
                <p class="title">Врач</p>
                <p>Университет</p>
                <p><a href="doctors/${doctor.id}"><button class="button_2">Открыть профиль</button></a></p>
            </div>
        </#list>
    </div>
</@p.page>