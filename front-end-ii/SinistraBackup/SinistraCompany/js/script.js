const principal = document.querySelector('.principal');
const descricao = document.querySelector('.descricao');
const nome = document.querySelector('.nome');
const url = document.getElementsByClassName('url').value;


function addElementos () { 
    
    principal.innerHTML = `
    <a href="index.html"><h1 class="bottonVoltar"> < </h1></a>
    
    <section class="formulario"> 
                            
        <div class="fotoUrlInserida">
            <img class="imagemSinistra" src="${url}">
        </div>

        <div class="Nome">Ola</div>

        <div class="descricao">ola</div>

    </form>
    </section>`

};

addElementos();


