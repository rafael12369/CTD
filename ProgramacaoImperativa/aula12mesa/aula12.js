// Testar o que significa return;

let numeros = [1, 2, 3];

function somaArray() {
    return numeros[0] + numeros[1] + numeros[2];
}

console.log(somaArray());


// Array join

let array1 = ["o","l","a"] ;

function join() {
    return array1[0] + array1[1] + array1[2];
}

console.log(join());

// Coleção de filme

let filmes = ["star wars", "matrix", "mr. robot", "o preço do amanhã",  "a vida é bela"];

console.log(filmes);


function letraMaiuscula(array2) {
    return array2.toUpperCase();
}


console.log(letraMaiuscula(filmes));