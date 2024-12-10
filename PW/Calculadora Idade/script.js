function calcularIdade() {
    // Pega o valor do campo de entrada
    const anoNascimento = document.getElementById('anoNascimento').value;
    
    // Obtém o ano atual
    const anoAtual = new Date().getFullYear();
    
    // Calcula a idade
    const idade = anoAtual - anoNascimento;
    
    // Exibe o resultado
    document.getElementById('resultadoIdade').innerText = 'Sua idade é: ' + idade + ' anos';
}
