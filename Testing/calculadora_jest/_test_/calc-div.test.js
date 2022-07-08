const { multiplicação, subtracao, multiplicacao, divisao } = require('../calc.js');

describe('Teste de divisão', () =>{

    test('divisão de dois numeros', () =>{
        expect(divisao(5,5)).toBe(1);
    })

    test('divisão de zeros', () =>{
        expect(divisao(0,0)).toBe(NaN);
    })

    test('divisão de duas strings', () =>{
        expect(divisao("a","b")).toBe(NaN);
    })

    test('divisão de valor negativo', () =>{
        expect(divisao(-2,4)).toBe(-0.5);
    })
});
