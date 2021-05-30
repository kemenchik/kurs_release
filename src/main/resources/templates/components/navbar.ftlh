<#include "security.ftlh">
<#macro navbar>
    <header class="header" id="header">
        <div class="container">
            <div class="header_inner">
                <div class="header_logo">
                    <a href="/"><img src="/images/ActiveBox.png" alt=""></a>
                </div>
                <nav class="nav" id="nav">
                    <#if isAdmin>
                        <a class="nav_link" href="/admin">Админ</a>
                    </#if>
                    <a class="nav_link" href="/works">Работы</a>
                    <a class="nav_link" href="/reviews">Отзывы</a>
                    <a class="nav_link" href="/doctors">Наши врачи</a>
                    <a class="nav_link" href="/cabinet">${name}</a>
                </nav>
            </div>
        </div>
    </header>
</#macro>