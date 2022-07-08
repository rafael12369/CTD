// function executor(func) {
//     // código da função 
//     func();
//     // código da função 
// }
 
// function somar(a, b) {
//     return a + b;
// }
 
// executor(somar(1, 2));

// minhaFuncao('este é um parâmetro aleatório', (a, b) => { return a + b; });

// // Opção 1
// minhaFuncao('este é um parâmetro aleatório', (a, b) => a + b );
 
// // Opção 2
// minhaFuncao('este é um parâmetro aleatório', function(a, b){ return a + b; });
 
// // Opção 3
// minhaFuncao('este é um parâmetro aleatório', (a, b) => {
//     return a + b;
// });

// callback((a, b) => {});

saudar();

function saudar() {
    return "Olá";
}

const saudacao = function =>  {
    return "Olá";
}