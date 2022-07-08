const img = document.querySelectorAll(".cartao img");
const urlImagens = [];

img.forEach(function(_, index){
        const url = prompt(`Adicione o url para a imagem ${index + 1}`);
        urlImagens.push(url);


});

urlImagens.forEach(function(url, index){
    const imagem = document.querySelector(`#imagem-${index + 1}`);
    imagem.setAttribute = ("src" , url);

});

const a = document.createElement("a");
const img2 = img.innerHTML;

a.appendChild(push(img2));


