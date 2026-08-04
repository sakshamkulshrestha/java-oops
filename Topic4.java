class ThermalImager{
    String colorPalette;
    int maxTemperatureC;

    ThermalImager(String color, int temp){
        colorPalette = color;
        maxTemperatureC = temp;
    }

    public String getColorPalette() {
        return colorPalette;
    }

    public int getMaxTemperatureC() {
        return maxTemperatureC;
    }

    
}

public class Topic4 {
    public static void main(String[] args) {
        ThermalImager obj = new ThermalImager("Ironbow", 450);
        System.out.println(obj.colorPalette);
        System.out.println(obj.maxTemperatureC);

    }
}
