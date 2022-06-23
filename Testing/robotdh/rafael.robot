*** Settings ***
Library           SeleniumLibrary
Resource          ./rafael.resource
Test Setup        Acessar a loja
Test Teardown     Close Browser

*** Test Case ***
Processo de compra na loja Sauce Demo
   Fazer login
   Adicionar um produto ao carrinho

Processo de login com dados incorretos
   Fazer login com dados incorretos