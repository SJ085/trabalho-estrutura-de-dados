document.getElementById("cadastroForm").addEventListener("submit", function(event) {
    var nome = document.getElementById("nome").value;
    var cpf = document.getElementById("cpf").value;
    var email = document.getElementById("email").value;

    
    if (nome.trim() === "" || cpf.trim() === "" || email.trim() === "") {
        alert("Por favor, preencha todos os campos obrigatórios.");
        event.preventDefault(); 
    }
});
