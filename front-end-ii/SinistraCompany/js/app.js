const principal = document.querySelector('#principal');

const descricao = document.querySelector('#descricao');
const nome = document.querySelector('#nome');
const url = document.querySelector('#url');
const section = document.createElement('section');
principal.appendChild(section);

function addElementos () { 
    

    let valor = url.value;
    principal.innerHTML += `
    <a href="index.html"><h1 class="bottonVoltar"> < </h1></a>
    
    <section class="formulario"> 
                            
        <div class="fotoUrlInserida">
            <img class="imagemSinistra" src="${valor}">
        </div>

        <div class="Nome">Ola</div>

        <div class="descricao">ola</div>

    </form>
    </section>`;


    

    
   


};





