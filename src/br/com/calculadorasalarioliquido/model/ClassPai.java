package br.com.calculadorasalarioliquido.model;

import br.com.calculadorasalarioliquido.repository.ICalculadoraDeSalarioLiquido;

public class ClassPai implements ICalculadoraDeSalarioLiquido {

    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {
        return (salarioBruto + bonus ) - descontos;
    }
}
