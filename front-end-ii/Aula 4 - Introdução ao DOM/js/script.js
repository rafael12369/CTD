const cards = document.querySelectorAll('section article');

cards.forEach(function(option){
    option.addEventListener('mouseenter', function() {
        const change = document.getElementById(this.id);
        change.style.background = "black";
        change.style.color = "white";
    })

})

