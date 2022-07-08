function funcaoDeExemplo() {
    let x = "declarada dentro de uma função"; // x só pode ser utilizado na funcaoDeExemplo
    console.log("Função interna");
    console.log(x);
}
 
console.log(x);  // erro


var exibeMensagem = function() {
    if(true) { 
        var escopoFuncao = 'Caelum'; 
        let escopoBloco = 'Alura';

       console.log(escopoBloco); // Alura 
   } 
   console.log(escopoFuncao); // Caelum 
   console.log(escopoBloco); 
}

exibeMensagem(); //Alura //Caelum 

function funcaoPrimaria() {
    const variavelPrimaria = "Estou no bloco superior";
    
    function funcaoSecundaria() {
        const variavelSecundaria = "Sou do bloco inferior";
        
        console.log("Dentro: "+variavelPrimaria);
        console.log("Dentro: "+variavelSecundaria);
    }
funcaoSecundaria();
 
    console.log("Fora: "+variavelPrimaria);
    console.log("Fora: "+variavelSecundaria); // erro
}
funcaoPrimaria();

let somar = (a, b) => { 
    let valor = a + b;
    return valor;
}
console.log(somar(1, 4)); //5

let somarSimples = (a, b) => a + b;
console.log(somarSimples(1, 4)); //5