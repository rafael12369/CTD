const { soma, subtracao, multiplicacao, divisao } = require('../calc.js');

describe('Teste de subtração', () =>{

    test('Subtração de dois números', () =>{
        expect(subtracao(5,3)).toBe(2);
    })

    test('Subtração de dois zeros', () =>{
        expect(subtracao(0,0)).toBe(0);
    })

    test('Subtração de dois nulos', () =>{
        expect(subtracao(null,null)).toBe(0);
    })

    test('Subtração de caracteres', () =>{
        expect(subtracao('a','b')).not.toBe(0);
    })

});