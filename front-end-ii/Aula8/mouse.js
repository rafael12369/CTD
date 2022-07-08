var btnRodrigo1 = document.querySelector('.rodrigo1')
var btnRodrigo2 = document.querySelector('.rodrigo2')

// Retorna true quando colocamos o cursor do mouse em cima do elemento
btnRodrigo1.onmouseover = function(){
    console.log('Você passou o mouse')
}

btnRodrigo1.addEventListener('mouseover', function() {
    console.log('Você passou o mouse')
});

// Retorna true quando retiramos o cursor do mouse
btnRodrigo2.onmouseout = function(){
    console.log('Você passou o mouse')
}

btnRodrigo2.addEventListener('mouseout', function() {
    console.log('Você passou o mouse')
});