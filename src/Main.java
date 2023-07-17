
public class Main {

    public static int baseToDecimal(int number, int base){
        int result = 0, index = 0;
        while (number > 0){
            result += (number%10)*Math.pow(base, index);
            index++;
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(baseToDecimal(22, 3));
    }
}