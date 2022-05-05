public class Main {
    public static void main(String[] args) {
        double sum=0;
        boolean check=false;
        int count=0;
        double[] digits = {2.23, 3.845, -9.74, 6.39567, 23.2, -39.203, 1.0, 8.05, 7.3459, 5.004, -0.92, -8.53, 7.828, 17.928, -52.2973};
        for (double digit : digits) {
            if (digit< 0) {
                check=true;
            }else if(digit> 0 && check) {
                    sum = sum + digit;
                    count++;
                }
                }
        System.out.println("Среднее арифметическое: "+sum/count);
    }
}