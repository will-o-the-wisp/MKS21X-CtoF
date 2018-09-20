public class CtoFTester{
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(100));
    System.out.println(fahrenheitToCelsius(212));
  }
  public static double celsiusToFahrenheit(double x){
    return 1.8*x+32;
  }
  public static double fahrenheitToCelsius(double x){
    return (x-32)/1.8;
  }
}
