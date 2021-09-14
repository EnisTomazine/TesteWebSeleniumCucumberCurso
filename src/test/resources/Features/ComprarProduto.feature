# encoding: UTF-8
# language: pt
Funcionalidade: Comprar Produto

    @ComprarProduto
    Esquema do Cenario: Pesquisar produto com clic na lupa
        Dado que acesso o site madeiramadeira.com.br
        E concordo com os cookies
        Quando clico no campo de busca e pesquiso o <produto>
        Entao confirmo que aparece o nome <produto>
        E o <id> do <produto> pesquisado
        Quando clico no <produto> pesquisado
        Entao confirmo se aparece o nome do <produto>
        E o <preco> do produto
        Quando clico no botao comprar
        Entao confirmo se aparece o <produto> no carrinho

        Exemplos:
            |produto| id| preco |
            |"Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira"   | "632562"| "237,40"|
            |"Escrivaninha 1 Gaveta Facility Demobile"                  | "526413"| "159,89"|


