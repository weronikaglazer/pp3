public class Temperatures {
    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    static double celsiusToFahrenheit(double celsius) {
        return celsius * (9/5) + 32;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    static double kelvinToFahrenheit(double kelvin) {
        return kelvin * (9/5) - 459.67;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / (9/5);
    }

    static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * (5/9);
    }

    public static void main(String[] args) {
        System.out.println(Temperatures.celsiusToKelvin(25));
        System.out.println(Temperatures.celsiusToFahrenheit(25));
        System.out.println(Temperatures.fahrenheitToCelsius(100));
        System.out.println(Temperatures.fahrenheitToKelvin(100));
        System.out.println(Temperatures.kelvinToCelsius(0));
        System.out.println(Temperatures.kelvinToFahrenheit(0));
    }
}
