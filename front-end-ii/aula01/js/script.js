
// Desenvolver um script que permita somar um array de números consecutivos, de forma que se some o primeiro número com o segundo e o imprima através do console. 
// Depois, temos que pegar este resultado e somar o terceiro número, e assim por diante, até termos terminado de percorrer todo o array.


let array = [1, 2, 4, 8]
let soma = 0;
for (let i = 0; i < array.length; i++) {
    soma += array[i];
    console.log(soma);
}


let soma1 = 
    array.reduce((acumulador, valor) => {
      console.log(acumulador)
      return acumulador + valor
    });

  console.log(soma1);
  

