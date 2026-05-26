async function carregaProdutos() {

    try {
        let resposta = await fetch("http://localhost:8080/roupa") //Promisse
        console.log(resposta);
        let listaProdutos = await resposta.json();
        console.log(listaProdutos);

        let tabela = document.getElementById("tabelaProdutos")

        console.log(listaProdutos[0])

        tabela.innerHTML = ""

        listaProdutos.forEach(produto => {
          tabela.innerHTML += `
            <tr>
                <td>${produto.id}</td>
                <td>${produto.nomeProduto}</td>
                <td>${produto.marca}</td>
                <td>${produto.tamanho}</td>
                <td>R$ ${(produto.preco.toFixed(2))}</td>
                <td>${produto.quantidade}</td>
                <td>R$ ${(produto.quantidade * produto.preco).toFixed(2)}</td>
                <td>
                    <button class="btn btn-danger btn-sm" t1itle="Excluir Produto" onclick="excluirProduto(${produto.id})">
                    <i class="bi bi-trash"></i>
                    </button>
                </td>
            </tr>
        `      
        });
        
    } catch (erro) {
        console.log(erro);

    }
    
}

function excluirProduto(id){
   //enviar requicição
    fetch(`http://localhost:8080/roupa/${id}`,{
        method: "DELETE"
    })

    //Reposta da requição
    .then(response => {

        if (response.ok){
            Swal.fire({
                title : "ROUPA EXCLUIDA COM SUCESSO", 
                text : "ROUPA EXCLUIDA", 
                icon : "success"
            })
            carregaProdutos()
        }
        else{
            Swal.fire({
                title : "ERRO EXCLUIR ROUPA", 
                text : "ROUPA NÃO EXCLUIDA", 
                icon : "erro"
            })
        }
    })

    .catch(erro => {
        console.log("erro : " , erro)
    })
}

carregaProdutos()