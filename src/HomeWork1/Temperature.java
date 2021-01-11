package HomeWork1;


public class Temperature implements TempConverter {
    double Celsius;
    double Fahrenheit;
    double Kelvin;
    public Temperature(double Celsius)
    {
        this.Celsius=Celsius;
        this.Fahrenheit= TempConverter.convertCelToFahr(Celsius);
        this.Kelvin= TempConverter.convertCelToKel(Celsius);
    }
    public Temperature(char Type,double temp)
    {
        switch (Type)
        {
            case 'C':
                this.Celsius=temp;
                this.Fahrenheit= TempConverter.convertCelToFahr(Celsius);
                this.Kelvin= TempConverter.convertCelToKel(Celsius);
                break;
            case 'F':
                this.Fahrenheit=temp;
                this.Celsius= TempConverter.convertFahrToCel(temp);
                this.Kelvin= TempConverter.convertFahrToKel(temp);
                break;
            case 'K':
                this.Kelvin=temp;
                this.Celsius= TempConverter.convertKelToCel(temp);
                this.Fahrenheit= TempConverter.convertKelToFahr(temp);
                break;
            default:
                System.out.println("Error! Default type of temp.");
                this.Celsius=temp;
                this.Fahrenheit= TempConverter.convertCelToFahr(Celsius);
                this.Kelvin= TempConverter.convertCelToKel(Celsius);
                break;
        }
    }


    public void showTemperature()
    {
        System.out.println("Temperature: "+Celsius+" C, "+Fahrenheit+" F, "+Kelvin+" K.");
    }
}
