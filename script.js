const formulario = document.queruSelector("fora");
const Inome = document.querySelector("nome");
const Icpf = document.querySelector("cpf");
const Iemail = document.querySelector("email");
const Itel = document.querySelector("tel");

function cadastrar () {
    
     fetch("echo/json/"), 
     {
        headers: {
            'Accept': 'application/json',
            'Content=Type': 'application/jason'
        },
        methon: "POST",
        body: JSON.stringify({ a: 1, b: 2 })
     })
     .then(function (res) {console.log(res) })
     .catch(function (res) {console.log(res) })
    };


formulario.addEventListener('submit', (event) {
        event.preventDefault();

        cont dados = {
            nome: Inome.value
            nome: Icpf.value
            nome: Iemail.value
            nome: Itel.value

};
});