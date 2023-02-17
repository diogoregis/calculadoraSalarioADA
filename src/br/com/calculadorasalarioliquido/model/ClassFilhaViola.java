package br.com.calculadorasalarioliquido.model;

public class ClassFilhaViola extends ClassPai{


    public Double calcular(Double salarioBruto, Double descontos, Double bonus){
        if(bonus <= 1000.00 && bonus > 0){
            if(salarioBruto >= 1302.00){
                if(descontos <= salarioBruto){
                    return (salarioBruto + bonus ) - descontos;
                } else {
                    throw new RuntimeException("Desconto maior que salario bruto, não permitido");
                }
            } else {
                throw new RuntimeException("Salario abaixo do minimo");
            }
        } else {
            throw new RuntimeException("Bonus, acima do permitido.");
        }
    }

}
