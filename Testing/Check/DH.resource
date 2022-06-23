*** Variables ***
${SITE}                           https://www.digitalhouse.com/br
${BROWSER}                        Chrome          
${SEE_OTHER_COURSES_BOX}          xpath=//*[@id="__next"]/div/main/section/div/div[3]/div/a
${DATA_ANALYTICS_BOX}             xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[3]/a/span/p[1]
${DATA_SCIENCE_BOX}               xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[4]/a/span
${MARKETING_DIGITAL_BOX}          xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[8]/a/span/p[1]
${CTD_BOX}                        xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[1]/a/span/p[1]
${CTD_NOME_BOX}                   xpath=//*[@id="name"]
${CTD_SOBRENOME_BOX}              xpath=//*[@id="lastname"]
${CTD_EMAIL_BOX}                  xpath=//*[@id="email"]
${CTD_DDD_BOX}                    xpath=//*[@id="phonecode"]
${CTD_TELEFONE_BOX}               xpath=//*[@id="phone"]
${CTD_TERMOS_BOX}                 xpath=//*[@id="tyc"]
${QUERO_MINHA_BOLSA_BOX}          xpath=//*[@id="__next"]/div/main/div[1]/div/div/div[2]/div/a
${QMB_NOME_BOX}                   xpath=//*[@id="CzpXMe7EhpI6diDHrN8Oa1GHrhEPfIsA"]
${QMB_SOBRENOME_BOX}              xpath=//*[@id="f02RR9bt0eNTrF0fJuC2azUMkD7TRX7M"]
${QMB_EMAIL_BOX}                  xpath=//*[@id="MUDBMzoKRZnrEBNp5XfGwgA0rdT7iCUw"]
${QMB_CELULAREDDD_BOX}            xpath=//*[@id="IIqCGDME1hJVbZz5duh3TgaPEzSbSd6G"]
${QMB_ESTADO_BOX}                 xpath=//*[@id="ZGczPPDExPE6xndDZ05KhIgLkrMZSfbL"]
${QMB_COR_BOX}                    xpath=//*[@id="dZIt6ReeUqhJIp1n4Z5zAAJNmPqCvK1T"]
${QMB_TERMOS_BOX}                 xpath=//*[@id="nB2kF0hw2IEBSJmBHz1NbqnG9XylORio"]
${COURSE_MAIN_TEXT_ELEMENT}       xpath=//*[@id="__next"]/div/main/section/div/div/div[1]/div/div[1]/p
${COURSE_DESC_ELEMENT}            xpath=//*[@id="__next"]/div/main/div[2]/div/div[2]/div                        
${COURSE_CTD_DESC_ELEMENT}        xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[1]
${BPDEV_MAIN_TEXT_ELEMENT}        xpath=//*[@id="DTaGShpSJPy4ZLyZ4VigyySSvSRUcLty"]/p/font
${BPDEV_DESC_ELEMENT}             xpath=//*[@id="WH9cMZPeWL6oO8HcftTX19ZIHRVz3fSD"]/div/div
${INSCREVA_SE_AGORA_ELEMENT}      xpath=//*[@id="__next"]/div/main/section/div/div/div[1]/div/div[2]/div[1]/a
${INSCREVA_SE_ELEMENT}            xpath=//*[@id="0"]/div/a
${QUERO_MINHA_BDE_BOX}            xpath=//*[@id="S6I9mVUafA1bbD5Bqc0xkFaqOMcdCRbf"]/div[1]
${COURSE_VALUE_ELEMENT}           xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[2]/dl/div/div[4]/div/div/span[2]


*** Keywords ***
Open the digital house website
  Open Browser                     ${SITE}                         ${BROWSER}
  Maximize Browser Window
  Set Selenium Speed               0.5

Accept cookies
  Sleep                            5
  Select frame                     xpath=/html/body/iframe[2]
  Click Element                    xpath=/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]
  Unselect frame

Click to see other courses
  Wait and Click                  ${SEE_OTHER_COURSES_BOX}



Select data analytics course
  Wait and Click                  ${DATA_ANALYTICS_BOX}

Select data science course
  Wait and Click                  ${DATA_SCIENCE_BOX}  

Select marketing digital course
  Wait and Click                  ${MARKETING_DIGITAL_BOX}

Select Certified Tech Developer Course
  Wait and Click                  ${CTD_BOX}
 



Check that the D.A. course description contains the correct description 
  Element Should Contain          ${COURSE_MAIN_TEXT_ELEMENT}  voltado para qualquer pessoa que deseja ampliar suas capacidades analíticas

Check that the D.S. course description contains the correct description 
  Element Should Contain          ${COURSE_MAIN_TEXT_ELEMENT}  profissionais de diversas áreas que desejam melhorar sua comunicação como engenheiros de Big Data

Check that the M.D. course description contains the correct description 
  Element Should Contain          ${COURSE_MAIN_TEXT_ELEMENT}  voltado para as pessoas que querem ingressar na carreira de marketing digital

Check that the C.T.D. course description contains the correct description 
  Element Should Contain          ${COURSE_MAIN_TEXT_ELEMENT}  Uma carreira pensada e desenhada pela Digital House, Mercado Livre e Globant

Check that the B.P.Dev. Scholarship Program description contains the correct description
  Element Should Contain          ${BPDEV_MAIN_TEXT_ELEMENT}   Uma carreira em Programação para mudar o seu futuro




Check that the D.A. course description contains a specific phrase
  Element Should Contain          ${COURSE_DESC_ELEMENT}      pessoas interessadas em business intelligence

Check that the D.S. course description contains a specific phrase
   Element Should Contain         ${COURSE_DESC_ELEMENT}      adquirir habilidades práticas com as ferramentas específicas para fazer análises

Check that the M.D. course description contains a specific phrase
   Element Should Contain         ${COURSE_DESC_ELEMENT}      Empreendedores que desejam compreender os fundamentos da área e as principais estratégias de marketing digital

Check that the C.T.D. course description contains a specific phrase
   Element Should Contain         ${COURSE_CTD_DESC_ELEMENT}  Se você deseja mergulhar no mundo da programação e no desenvolvimento de novos produtos digitais

Check that the B.P.Dev. Scholarship Program description contains a specific phrase
   Page Should Contain            Valor das parcelas: a partir de R$88,00 mensais



Check that the B.P.Dev. Scholarship Program page contains the correct text
  Page Should Contain             Confira os requisitos para a bolsa de estudo



Click in "Inscreva-se agora"
  Click Element                   ${INSCREVA_SE_AGORA_ELEMENT}



Click in "Inscreva-se"
  Click Element                   ${INSCREVA_SE_ELEMENT}



Click in "Quero minha bolsa"
  Click Element                   ${QUERO_MINHA_BOLSA_BOX}



Click in "Quero minha bolsa de estudo"
  Click Element                   ${QUERO_MINHA_BDE_BOX}



Validate that the value of the D.A. course
  Wait and Validate               ${COURSE_VALUE_ELEMENT}   R$10.315

Validate that the value of the D.S. course
  Wait and Validate               ${COURSE_VALUE_ELEMENT}   R$11.878

Validate that the value of the M.D. course
  Wait and Validate               ${COURSE_VALUE_ELEMENT}   R$9.376

Validate that the value of the C.T.D. course
  Wait and Validate               ${COURSE_VALUE_ELEMENT}   a partir de R$ 289,00 mensais



Fill in the fields of the “Dados para inscrição” form
  Input Text                      ${CTD_NOME_BOX}          Rafael
  Input Text                      ${CTD_SOBRENOME_BOX}     Martínez
  Input Text                      ${CTD_EMAIL_BOX}         rafaelmartinez.qa@gmail.com
  Input Text                      ${CTD_DDD_BOX}           12
  Input Text                      ${CTD_TELEFONE_BOX}      981787456
  Click Element                   ${CTD_TERMOS_BOX} 
  

Fill in the fields of the “QUERO MINHA BOLSA” form
  Input Text                      ${QMB_NOME_BOX}          Rafael
  Input Text                      ${QMB_SOBRENOME_BOX}     Martínez
  Input Text                      ${QMB_EMAIL_BOX}         rafaelmartinez.qa@gmail.com
  Input Text                      ${QMB_CELULAREDDD_BOX}   12981787456
  Click Element                   ${QMB_ESTADO_BOX}
  Click Element                   xpath=//*[@id="ZGczPPDExPE6xndDZ05KhIgLkrMZSfbL"]/option[25]
  Click Element                   ${QMB_COR_BOX}
  Click Element                   xpath=//*[@id="dZIt6ReeUqhJIp1n4Z5zAAJNmPqCvK1T"]/option[4]
  Click Element                   ${QMB_TERMOS_BOX} 
   
  













Wait and Click
  [Arguments]                     ${ELEMENT}
  Wait Until Element is Visible   ${ELEMENT}                     120
  Click Element                   ${ELEMENT}

Wait and Validate
  [Arguments]                     ${ELEMENT}  ${ELEMENT2}
  Wait Until Element is Visible   ${ELEMENT}                     120
  Element Should Contain          ${ELEMENT}  ${ELEMENT2}