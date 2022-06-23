*** Variables ***
${SITE}           https://www.saucedemo.com
${NAVEGADOR}      Chrome
${CAMPO_USUARIO}  css=#user-name
${CAMPO_SENHA}    css=#password
${BOTAO_LOGIN}    css=#login-button
${USUARIO}        standard_user
${SENHA}          secret_sauce
${USUARIO_INCORRETO}        usuario_incorreto
${SENHA_INCORRETA}          senha_incorreta
${ADICIONAR_PRODUTO}      xpath=//*[@id="add-to-cart-sauce-labs-backpack"]



*** Keywords ***
Acessar a loja
   Open Browser     ${SITE}            ${NAVEGADOR}
   Maximize Browser Window
   Set Selenium Speed        0.5

Fazer login 
   Wait and Input Text                    ${CAMPO_USUARIO}   ${USUARIO}
   Wait and Input Text                    ${CAMPO_SENHA}     ${SENHA}
   Wait and Click                ${BOTAO_LOGIN}
   Page Should Contain           Products

Fazer login com dados incorretos
   Wait and Input Text                    ${CAMPO_USUARIO}   ${USUARIO_INCORRETO}
   Wait and Input Text                    ${CAMPO_SENHA}     ${SENHA_INCORRETA}
   Wait and Click                ${BOTAO_LOGIN}
   Page Should Contain           Epic sadface

Adicionar um produto ao carrinho
   Wait and Click  ${ADICIONAR_PRODUTO}













Wait and Click
  [Arguments]                    ${ELEMENTO}
  Wait Until Element is Visible  ${ELEMENTO}  30
  Click Element                  ${ELEMENTO}


Wait and Input Text
  [Arguments]                    ${ELEMENTO}  ${TEXTO}
  Wait Until Element is Visible  ${ELEMENTO}  30
  Input Text                     ${ELEMENTO}  ${TEXTO}