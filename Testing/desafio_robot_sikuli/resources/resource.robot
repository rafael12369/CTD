*** Settings ***
Library                  SikuliLibrary
#Capture Screen
#Exists  

*** Keywords ***

Close Browser
    Close Application     Google Chrome

Load Elements
    Add Image Path      ${CURDIR}\\elements

Given the user opens the trincentis website
    Load Elements
    Click                 chrome.png
    Input Text            google1.png      http://sampleapp.tricentis.com/101/app.php
    Press Special Key     ENTER

When he fills in the form on the “Enter Vehicle Data” tab and press next
    Click                 make.png
    Click                 bmw.png
    Input Text            engineperformance.png           2000