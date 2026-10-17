public class TemperatureConversions{
        public static void main(String[] args){
         double c = 25.0;
         double k = 300.0;
         double f = 77.0;
         double c_to_f = (c * 9 / 5) + 32;
         double c_to_k = (c + 273.15);
         double f_to_c  = (f - 32 ) * 5 / 9 ;
         double f_to_k = (f - 32) * 5 / 9 + 273.15;
         double k_to_c = k - 273.15;
         double k_to_f = (k - 273.15) * 9 / 5 + 32;
         System.out.println("Celsius to Fahrenheit: " + c_to_f);  
          System.out.println("Celsius to Fahrenheit: " + c_to_k);
          System.out.println("Fahrenheit to Celsius: " + f_to_c);
            System.out.println("Fahrenheit to Kelvin: " + f_to_k);
            System.out.println("Kelvin to Celsius: " + k_to_c);
             System.out.println("Kelvin to Fahrenheit: " + k_to_f);
        }
}