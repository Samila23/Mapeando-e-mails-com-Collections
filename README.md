
<h1 align="center">Sistema de Email</h1>

<h4 align="center">Status: Criado</h4>

<p align="center">Sistemas de Gerenciamento de Emails.</p>

<div align="center">
Desenvolvido por: 
https://github.com/CamilaLima21
https://github.com/Leticia-Viana
https://github.com/michelledantas
https://github.com/robertacaroline
https://github.com/Samila23


<p align="justify">Sistema que possibilita realizar o gerenciamento de uma Caixa de Emails. Nele contém funcionalidades que permitem visualizara conta de e-mail, o endereço de quem o enviou, a data de envio, a data de recebimento, o assunto e o texto do e-mail (não se consideram anexos, etc.).

Crie uma classe MailMap que associe a cada endereço de envio todos os mails recebidos (classe EMail) e implemente as seguintes operações:</p>
</div>

<h2>Como subir o ambiente:</h2>
<h4>1º Após subir a aplicação, abrir no navegador o link: http://localhost:8080/swagger-ui/index.html.</h4>
<br>
<h2>Para testar funcionalidades da API:</h2>
<h4>2º No endpoint Produtos, POST /produtos, utilizar a massa abaixo (podendo alterar conforme a necessidade).</h4>
<pre>
<p>
{
  "idProduto": 1,
  "nome": "Brinquedo",
  "preco": 9.9,
  "quantidadeProduto": 10,
  "descricaoProduto": "carrinho"
}
</p>
</pre>
<p>Caso utilize o mesmo idProduto de um produto já existente no momento criação, vc irá alterar os dados do produto</p>
<h4>3º No endpoint Produtos, POST /vendas, utilizar a Massa abaixo para realizar uma venda.</h4>
<pre>
<p>
{
  "idVenda": 1,
  "clientes": {
    "idCliente": 1,
    "nome": "Samila Milena",
    "rg": "000xx",
    "cpf": "000.000.000-00",
    "idade": 18
  },
  "produtos": {
    "idProduto": 1,
    "nome": "Livro",
    "preco": 9.90,
    "quantidadeProduto": 10,
    "descricaoProduto": "Codigo Limpo"
  }
}
</p>
</pre>
<p>Caso utilize o mesmo idVenda de uma venda já existente no momento criação, vc irá atualizar os dados da venda</p>
<h4>4º Após Criar a venda, você poderá consultar a venda realizada em GET /venda , poderá consultar o produto cadastrado em GET /produto , consultar o cliente em GET /cliente , além disso será possivel verificar a movimentação de saíde e entrada do estoque em GET /estoque.</h4>

<div align="center">

## Tecnologias usadas:


<table>
  <tr>
    <td>Java</td>
    <td>SpringBoot</td>
  </tr>
  <tr>
    <td>11</td>
    <td>2.6.7</td>
  </tr>
</table>
 
<table>
  <tr>
    <td align="center"><a href="https://github.com/Samila23"><br/><sub><b>Sâmila Milena</b></sub></a><br /></td>
  </tr>
</table>

</div>
