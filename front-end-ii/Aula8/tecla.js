var btnRodrigo3 = document.querySelector('#rodrigo3');

    // Detecta tecla inserida no input
    btnRodrigo3.onkeydown = function(event){
        alert('Tecla acionada: ' + event.key)
    }

    //keyup & keypress apenas variações desse mesmo evento