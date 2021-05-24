<#import "components/page.ftlh" as p>

<@p.page>
    <div class="container">
        <div class="deck-wrap">
            <div class="deck">
                <#list reviews as review>
                    <div class="card">
                        <div class="cardHeader">${review.addressee.firstName} ${review.addressee.secondName}</div>
                        <div class="cardBody">
                            <p>${review.text}</p>
                        </div>
                        <div class="cardFooter">${review.author.username}</div>
                    </div>
                </#list>
            </div>
        </div>
    </div>
</@p.page>