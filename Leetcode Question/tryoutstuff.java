public class tryoutstuff {
    public static void main(String[] args) {
        // int[] arr = {5,8,84,81};
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         System.out.println(i +"    "+ j);
        //     }
        // }
        double celsius = 36.50;
        double[] result = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        result[0] = kelvin;
        result[1] = fahrenheit;
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
