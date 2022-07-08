var btn = document.querySelector('.rodrigo')
var hyperLink = document.querySelector('.bolsonaro')


// Evita falhas no carregamento do JS na página
window.onload = function (){

    // Pega o evento de clicque do botão
    btn.onclick = function(){
        console.log("Você clicou!");
    };
    
    // Interompe a ação nativa do Tag
    hyperLink.addEventListener('click', function(event) {
            console.log("No prevente Default!");
            event.preventDefault();

        }
    )

}
