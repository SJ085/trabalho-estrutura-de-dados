const formCadastro = document.getElementById('form-cadastro');
const formBusca = document.getElementById('form-busca');

formCadastro.addEventListener('submit', (event) => {
    event.preventDefault();

    const nome = document.getElementById('nome').value;
    const cpf = document.getElementById('cpf').value;
    const email = document.getElementById('email').value;
    const telefone = document.getElementById('telefone').value;

    // Cadastrar o cliente

    console.log(`Nome: ${nome}`);
    console.log(`CPF: ${cpf}`);
    console.log(`Email: ${email}`);
    console.log(`Telefone: ${telefone}`);

    // Limpar o formulário
    formCadastro.reset();
});

formBusca.addEventListener('submit', (event) => {
    event.preventDefault();

    const cpfBusca = document.getElementById('cpf-busca').value;

    // Buscar o cliente por CPF

    console.log(`CPF: ${cpfBusca}`);

    // Exibir os dados do cliente
});
