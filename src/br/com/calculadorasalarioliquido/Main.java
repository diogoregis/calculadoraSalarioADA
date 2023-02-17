package br.com.calculadorasalarioliquido;

import br.com.calculadorasalarioliquido.model.ClassFilhaOseas;
import br.com.calculadorasalarioliquido.model.ClassFilhaViola;
import br.com.calculadorasalarioliquido.model.ClassPai;

public class Main {

    public static void main(String[] args) {

        Double salarioBruto = 1700.00;
        Double descontos = 300.00;
        Double bonus = 100.00;

        ClassPai classPai = new ClassPai();
        ClassFilhaOseas classFilhaOseas = new ClassFilhaOseas();
        ClassFilhaViola classFilhaViola = new ClassFilhaViola();

        System.out.println(classPai.calcular(salarioBruto, descontos, bonus));
        System.out.println(classFilhaOseas.calcular(salarioBruto,descontos, bonus));
        System.out.println(classFilhaViola.calcular(salarioBruto,descontos, bonus));

        Double salarioBruto2 = 1700.00;
        Double descontos2 = 3000.00;
        Double bonus2 = 100.00;

        System.out.println(classPai.calcular(salarioBruto2, descontos2, bonus2));
        System.out.println(classFilhaOseas.calcular(salarioBruto2,descontos2, bonus2));
        System.out.println(classFilhaViola.calcular(salarioBruto2,descontos2, bonus2));

    }
}
