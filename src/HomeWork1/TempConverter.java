package HomeWork1;

public interface TempConverter{
    static double convertCelToFahr(double Celsius)
    {
        return (Celsius*1.8)+32;
    }
    static double convertCelToKel(double Celsius)
    {
        return Celsius+273.15;
    }
    static double convertFahrToCel(double Fahrenheit)
    {
        return (Fahrenheit-32)/1.8;
    }
    static double convertFahrToKel(double Fahrenheit)
    {
        return convertFahrToCel(Fahrenheit)+273.15;
    }
    static double convertKelToFahr(double Kelvin)
    {
        return (convertKelToCel(Kelvin)*1.8)+32;
    }
    static double convertKelToCel(double Kelvin)
    {
        return Kelvin-273.15;
    }
}
