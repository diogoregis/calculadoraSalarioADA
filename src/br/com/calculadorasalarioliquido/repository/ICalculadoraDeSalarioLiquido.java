package br.com.calculadorasalarioliquido.repository;

public interface ICalculadoraDeSalarioLiquido {
    Double calcular(Double salarioBruto, Double descontos, Double bonus);
}
