let numbers = [22, 33, 54, 66, 72]

console.log(numbers[numbers.length]);

let grupoDeAmigos = [ ["Harry", "Ron", "Hermione"], ["Spiderman", "Hulk", "Ironman"], ["Penélope Glamour", "Pierre Nodoyuna","Patán"] ]
console.log(grupoDeAmigos[1][2]);

let str = "uma string qualquer"
let grupoDeAmigos1 = [ [45, 89, 0], ["Digital", "House", true], ["string", "123","false", 54, true, str] ]
console.log(grupoDeAmigos1[2][grupoDeAmigos1[2].length -1 ])

// exerício array invertido //

function imprimirInverso(array) {
    console.log(array.reverse());
}

imprimirInverso(numbers);
console.log(numbers);

let meuArray2 = [5,6,7,8];
// invertArray - [3,2,1,0];

function inverterArray(array){
  let novoArray = [];
  novoArray.push(array.pop());
  novoArray.push(array.pop());
  novoArray.push(array.pop());
  novoArray.push(array.pop());
  

  // novoArray = []
  // array = [0,1,2] novoArray = [3]
  // array = [0,1] novoArray = [3,2];
  // array = [0] novoArray = [3,2,1];
  // array = [] novoArray = [3,2,1,0];

  return novoArray;

}

console.log(inverterArray(numbers));


let arraydoido = [-5, 100]

// somarArray

function somarArray(array) {

    let soma = 0;

    for(let i = 0; i < array.length; i++) {

     soma = soma + array[i];
    
    }
    
    return soma;
}

console.log(somarArray(numbers));


// array join

function join(array) {

    let espaco = '';
    let numero = 0;
    let joinn = undefined;

    for(let i = 0; i < array.lenght; i++) {
     
        numero = array[i]
        joinn =+ numero + espaco 
    
    }

    return joinn;
}

console.log(join(numbers));


// filmes

let filmes = ["star wars", "matrix", "mr. robot", "o preço do amanhã",  "a vida é bela"];

console.log(filmes);


function converterMaiusculas(array){
    // console.log(array);
    for(let i = 0; i < array.length; i++){
      // i = 0; array[i] -> star wars = STAR WARS
      // i = 1; array[i] -> totoro = TOTORO
      //..
      // i = 4 ; array[i] -> a vida é bela = A VIDA É BELA
  
      array[i] = array[i].toUpperCase();
    }
    return array
  }


console.log(converterMaiusculas(filmes));