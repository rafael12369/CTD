var pontuacaoUs = 0;
var pontuacaoPc = 0;


function jogar() {
    let maoUsuario = parseInt(prompt('Pedra(1), Papel(2) ou Tesoura(3)?'));

    let random = parseInt(Math.random() * 3 + 1); 

    let maoComputador = random;


    switch (maoUsuario) {
        case maoComputador:
            alert('Empate!'); 
            pontuacaoPc++;
            pontuacaoUs++;
            document.getElementById("Pc").innerHTML = pontuacaoPc;
            document.getElementById("Pu").innerHTML = pontuacaoUs;
            break;
        
        case 1:
            if (maoComputador === 2) {
                alert('Pedra perde para papel. Computador venceu!'); 
                pontuacaoPc++;
                document.getElementById("Pc").innerHTML = pontuacaoPc;
            }

            else {
                alert('Pedra vence Tesoura. Você venceu!');
                pontuacaoUs++;
                document.getElementById("Pu").innerHTML = pontuacaoUs;
            }
            break;

        case 2:
            if (maoComputador === 1) {
                alert('Papel vence pedra. Você venceu!'); 
                pontuacaoUs++;
                document.getElementById("Pu").innerHTML = pontuacaoUs;
            }

            else {
                alert('Papel perde para Tesoura. Computador venceu!');
                pontuacaoPc++;
                document.getElementById("Pc").innerHTML = pontuacaoPc;
            }
            break;

        case 3:
            if (maoComputador === 1) {
                alert('Tesoura perde para pedra. Computador venceu!'); 
                pontuacaoPc++;
                document.getElementById("Pc").innerHTML = pontuacaoPc;
            }

            else {
                alert('Pedra vence Tesoura. Você venceu!');
                pontuacaoUs++;
                document.getElementById("Pu").innerHTML = pontuacaoUs;
            }
            break;

        default: 
            alert('Escolha um número válido');
    }
}

function resetar() {

    pontuacaoPc = 0
    document.getElementById("Pc").innerHTML = pontuacaoPc;
    pontuacaoUs = 0
    document.getElementById("Pu").innerHTML = pontuacaoUs;


}