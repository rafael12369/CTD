const { multiplicação, subtracao, multiplicacao, divisao } = require('../calc.js');

describe('Teste de multiplicação', () =>{

    test('multiplicação de dois numeros', () =>{
        expect(multiplicacao(5,5)).toBe(25);
    })

    test('multiplicação de zeros', () =>{
        expect(multiplicacao(0,0)).toBe(0);
    })

    test('multiplicação de duas strings', () =>{
        expect(multiplicacao("a","b")).toBe(NaN);
    })

    test('multiplicação de valor negativo', () =>{
        expect(multiplicacao(-2,3)).toBe(-6);
    })
});
