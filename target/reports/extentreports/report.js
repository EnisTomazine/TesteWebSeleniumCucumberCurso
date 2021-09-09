$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ComprarProduto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# encoding: UTF-8"
    },
    {
      "line": 2,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Comprar cadeira",
  "description": "",
  "id": "comprar-cadeira",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Pesquisar produto com clic na lupa",
  "description": "",
  "id": "comprar-cadeira;pesquisar-produto-com-clic-na-lupa",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@ComprarProduto"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que acesso o site madeiramadeira.com.br",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "concordo com os cookies",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "clico no campo de busca e pesquiso o \u003cproduto\u003e",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "confirmo que aparece o nome \u003cproduto\u003e",
  "keyword": "Entao "
});
formatter.step({
  "line": 11,
  "name": "o \u003cid\u003e do \u003cproduto\u003e pesquisado",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "clico no \u003cproduto\u003e pesquisado",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "confirmo se aparece o nome do \u003cproduto\u003e",
  "keyword": "Entao "
});
formatter.step({
  "line": 14,
  "name": "o \u003cpreco\u003e do produto",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clico no botao comprar",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "confirmo se aparece o \u003cproduto\u003e no carrinho",
  "keyword": "Entao "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "comprar-cadeira;pesquisar-produto-com-clic-na-lupa;",
  "rows": [
    {
      "cells": [
        "produto",
        "id",
        "preco"
      ],
      "line": 19,
      "id": "comprar-cadeira;pesquisar-produto-com-clic-na-lupa;;1"
    },
    {
      "cells": [
        "\"Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira\"",
        "\"632562\"",
        "\"237,40\""
      ],
      "line": 20,
      "id": "comprar-cadeira;pesquisar-produto-com-clic-na-lupa;;2"
    },
    {
      "cells": [
        "\"Escrivaninha 1 Gaveta Facility Demobile\"",
        "\"526413\"",
        "\"159,90\""
      ],
      "line": 21,
      "id": "comprar-cadeira;pesquisar-produto-com-clic-na-lupa;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 3884004200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Pesquisar produto com clic na lupa",
  "description": "",
  "id": "comprar-cadeira;pesquisar-produto-com-clic-na-lupa;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@ComprarProduto"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que acesso o site madeiramadeira.com.br",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "concordo com os cookies",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "clico no campo de busca e pesquiso o \"Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "confirmo que aparece o nome \"Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.step({
  "line": 11,
  "name": "o \"632562\" do \"Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira\" pesquisado",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "clico no \"Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira\" pesquisado",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "confirmo se aparece o nome do \"Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.step({
  "line": 14,
  "name": "o \"237,40\" do produto",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clico no botao comprar",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "confirmo se aparece o \"Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira\" no carrinho",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "ComprarProduto.queAcessoOSiteMadeiramadeiraComBr()"
});
formatter.result({
  "duration": 9034206101,
  "status": "passed"
});
formatter.match({
  "location": "ComprarProduto.concordoComOsCookies()"
});
formatter.result({
  "duration": 409105000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira",
      "offset": 38
    }
  ],
  "location": "ComprarProduto.clico_no_campo_de_busca_e_pesquiso_o(String)"
});
formatter.result({
  "duration": 12881807700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira",
      "offset": 29
    }
  ],
  "location": "ComprarProduto.confirmo_que_aparece_o_nome(String)"
});
formatter.result({
  "duration": 653345800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "632562",
      "offset": 3
    },
    {
      "val": "Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira",
      "offset": 15
    }
  ],
  "location": "ComprarProduto.o_do_pesquisado(String,String)"
});
formatter.result({
  "duration": 61431101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira",
      "offset": 10
    }
  ],
  "location": "ComprarProduto.clico_no_pesquisado(String)"
});
formatter.result({
  "duration": 7880196199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira",
      "offset": 31
    }
  ],
  "location": "ComprarProduto.confirmo_se_aparece_o_nome_do(String)"
});
formatter.result({
  "duration": 1018051500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "237,40",
      "offset": 3
    }
  ],
  "location": "ComprarProduto.o_do_produto(String)"
});
formatter.result({
  "duration": 100764500,
  "status": "passed"
});
formatter.match({
  "location": "ComprarProduto.clico_no_botao_comprar()"
});
formatter.result({
  "duration": 300282600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cabeceira Casal Estofada Uvaia CabeCasa MadeiraMadeira",
      "offset": 23
    }
  ],
  "location": "ComprarProduto.confirmo_se_aparece_o_no_carrinho(String)"
});
formatter.result({
  "duration": 4894604601,
  "status": "passed"
});
formatter.after({
  "duration": 1315724699,
  "status": "passed"
});
formatter.before({
  "duration": 2289416000,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Pesquisar produto com clic na lupa",
  "description": "",
  "id": "comprar-cadeira;pesquisar-produto-com-clic-na-lupa;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@ComprarProduto"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que acesso o site madeiramadeira.com.br",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "concordo com os cookies",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "clico no campo de busca e pesquiso o \"Escrivaninha 1 Gaveta Facility Demobile\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "confirmo que aparece o nome \"Escrivaninha 1 Gaveta Facility Demobile\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.step({
  "line": 11,
  "name": "o \"526413\" do \"Escrivaninha 1 Gaveta Facility Demobile\" pesquisado",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "clico no \"Escrivaninha 1 Gaveta Facility Demobile\" pesquisado",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "confirmo se aparece o nome do \"Escrivaninha 1 Gaveta Facility Demobile\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.step({
  "line": 14,
  "name": "o \"159,90\" do produto",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clico no botao comprar",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "confirmo se aparece o \"Escrivaninha 1 Gaveta Facility Demobile\" no carrinho",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "ComprarProduto.queAcessoOSiteMadeiramadeiraComBr()"
});
formatter.result({
  "duration": 8562358199,
  "status": "passed"
});
formatter.match({
  "location": "ComprarProduto.concordoComOsCookies()"
});
formatter.result({
  "duration": 353190700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Escrivaninha 1 Gaveta Facility Demobile",
      "offset": 38
    }
  ],
  "location": "ComprarProduto.clico_no_campo_de_busca_e_pesquiso_o(String)"
});
formatter.result({
  "duration": 8983772600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Escrivaninha 1 Gaveta Facility Demobile",
      "offset": 29
    }
  ],
  "location": "ComprarProduto.confirmo_que_aparece_o_nome(String)"
});
formatter.result({
  "duration": 1619876799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "526413",
      "offset": 3
    },
    {
      "val": "Escrivaninha 1 Gaveta Facility Demobile",
      "offset": 15
    }
  ],
  "location": "ComprarProduto.o_do_pesquisado(String,String)"
});
formatter.result({
  "duration": 55964399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Escrivaninha 1 Gaveta Facility Demobile",
      "offset": 10
    }
  ],
  "location": "ComprarProduto.clico_no_pesquisado(String)"
});
formatter.result({
  "duration": 5763288000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Escrivaninha 1 Gaveta Facility Demobile",
      "offset": 31
    }
  ],
  "location": "ComprarProduto.confirmo_se_aparece_o_nome_do(String)"
});
formatter.result({
  "duration": 3289814900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "159,90",
      "offset": 3
    }
  ],
  "location": "ComprarProduto.o_do_produto(String)"
});
formatter.result({
  "duration": 289695699,
  "status": "passed"
});
formatter.match({
  "location": "ComprarProduto.clico_no_botao_comprar()"
});
formatter.result({
  "duration": 197066600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Escrivaninha 1 Gaveta Facility Demobile",
      "offset": 23
    }
  ],
  "location": "ComprarProduto.confirmo_se_aparece_o_no_carrinho(String)"
});
formatter.result({
  "duration": 6026226600,
  "status": "passed"
});
formatter.after({
  "duration": 1258943599,
  "status": "passed"
});
});