package fit.challenge;

public class ImcCalculator {
    public static String calculate(double weight, double height){

        double resultado = 0;
        resultado = weight / Math.pow(height, 2);

        if(resultado >=24.9 && resultado < 30){
            return "Sobrepeso";
        }else if (resultado >= 18.5 && resultado < 24.9){
            return "Normal";
        }
            return "Obesidade";
    }
}
