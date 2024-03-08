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

        Function limpar() = {
            Inome.value = "";
            Icpf.value = "";
            Iemail.value = "";
            Itel.value = "";
};
       formulario.addEventListener('submit', function (event) {
        event.preventDefault();

        cadastrar():
        limpar();
});