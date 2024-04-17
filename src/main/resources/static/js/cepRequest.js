function buscarEnderecoPorCEP(cep) {
    fetch(`https://viacep.com.br/ws/${cep}/json/`)
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao buscar o CEP');
            }
            return response.json();
        })
        .then(data => {

            if (data.erro == true) {
                document.getElementById('cep-erro').removeAttribute('hidden');
                document.getElementById('rua').value = "";
                document.getElementById('bairro').value = "";
                document.getElementById('cidade').value = "";
                document.getElementById('uf').value = "";
            } else {
                document.getElementById('rua').value = data.logradouro;
                document.getElementById('bairro').value = data.bairro;
                document.getElementById('cidade').value = data.localidade;
                document.getElementById('uf').value = data.uf;
                document.getElementById('cep-erro').setAttribute('hidden', true);
            }
        })
        .catch(error => {
            console.error('Erro:', error);
            document.getElementById('cep-erro').removeAttribute('hidden');
        });
}

document.addEventListener('DOMContentLoaded', function () {
    const btnValidar = document.querySelector('button');
    btnValidar.addEventListener('click', function (event) {
        event.preventDefault();
        const cep = document.getElementById('cep').value;
        buscarEnderecoPorCEP(cep);
    });
});
