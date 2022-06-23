#Rafael Martínez Pessoa Júnior

*** Settings ***
Library          SeleniumLibrary
Resource         ./DH.resource
Test Setup       Open the digital house website
Test Teardown    Close Browser

*** Test Case ***
Validation of data analytics course information
  Accept cookies
  Click to see other courses
  Select data analytics course
  Check that the D.A. course description contains the correct description 
  Check that the D.A. course description contains a specific phrase
  Click in "Inscreva-se agora"
  Click in "Inscreva-se"
  Validate that the value of the D.A. course


Validation of Data Science course information
  Accept cookies
  Click to see other courses
  Select data science course
  Check that the D.S. course description contains the correct description
  Check that the D.S. course description contains a specific phrase
  Click in "Inscreva-se agora"
  Click in "Inscreva-se"
  Validate that the value of the D.S. course


Validation of Digital Marketing course information
  Accept cookies
  Click to see other courses
  Select marketing digital course
  Check that the M.D. course description contains the correct description
  Check that the M.D. course description contains a specific phrase
  Click in "Inscreva-se agora"
  Click in "Inscreva-se"
  Validate that the value of the M.D. course


Validation of Certified Tech Developer course information
  Accept cookies
  Click to see other courses
  Select Certified Tech Developer Course
  Check that the C.T.D. course description contains the correct description
  Check that the C.T.D. course description contains a specific phrase
  Click in "Inscreva-se agora"
  Click in "Inscreva-se"
  Validate that the value of the C.T.D. course
  Fill in the fields of the “Dados para inscrição” form

Validation of information from the BLK PWR DEV Scholarship Program
  Accept cookies
  Click in "Quero minha bolsa"
  Check that the B.P.Dev. Scholarship Program description contains the correct description
  Check that the B.P.Dev. Scholarship Program page contains the correct text
  Check that the B.P.Dev. Scholarship Program description contains a specific phrase
  Click in "Quero minha bolsa de estudo"
  Fill in the fields of the “QUERO MINHA BOLSA” form