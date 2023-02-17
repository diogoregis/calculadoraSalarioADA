package br.com.calculadorasalarioliquido.model;

public class ClassFilhaOseas extends ClassPai{

    public Double calcular(Double salarioBruto, Double descontos, Double bonus){
        if(bonus <= 1000.00 && bonus > 0){
            if(salarioBruto >= 1302.00){
                if(descontos <= salarioBruto){
                    return (salarioBruto + bonus ) - descontos;
                } else {
                    System.out.println("Desconto maior que salario bruto, não permitido");
                    return -1.0;
                }
            } else {
                System.out.println("Salario abaixo do minimo");
                return -1.0;
            }
        } else {
            System.out.println("Bonus, acima do permitido.");
            return -1.0;
        }
    }

}
