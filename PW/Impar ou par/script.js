function verificarParImpar() {
    // Pega o valor do campo de entrada
    const numero = document.getElementById('numero').value;
    
    // Verifica se o número é par ou ímpar
    if (numero % 2 === 0) {
        document.getElementById('resultadoParImpar').innerText = 'O número é PAR';
    } else {
        document.getElementById('resultadoParImpar').innerText = 'O número é ÍMPAR';
    }
}
