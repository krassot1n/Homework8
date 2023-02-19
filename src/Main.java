public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задача №1 - 2");
        int[] num1 = new int[3];
        num1 [0] = 1;
        num1 [1] = 2;
        num1 [2] = 3;
        for (int i = 0; i < num1.length; i++){
            if(i < 2)
                System.out.print(num1[i] + ", ");
            else System.out.print(num1[i] + " ");
        }
        System.out.println();

        double[] num2 = {1.57, 7.654, 9.98};
        for (int i = 0; i < num2.length; i++){
            if(i < 2)
                System.out.print(num2[i] + ", ");
            else System.out.print(num2[i] + " ");
        }
        System.out.println();

        int[] num3 = {10, 9, 1996};
        for (int i = 0; i < num3.length; i++){
            if(i < 2)
            System.out.print(num3[i] + ", ");
            else System.out.print(num3[i] + " ");

        }
        System.out.println();
        }



    public static void task3() {
        System.out.println("Задача №3");
        int[] num1 = new int[3];
        num1 [0] = 1;
        num1 [1] = 2;
        num1 [2] = 3;
        for (int i = 2; i >= 0; i--){
            if(i > 0){
                System.out.print(num1[i] + ", ");}
            else System.out.print(num1[i] + " ");
        }
        System.out.println();

        double[] num2 = {1.57, 7.654, 9.98};
        for (int i = 2; i >= 0; i--){
            if(i > 0){
                System.out.print(num2[i] + ", ");}
            else System.out.print(num2[i] + " ");
        }
        System.out.println();

        int[] num3 = {10, 9, 1996};
        for (int i = 2; i >= 0; i--){
            if(i > 0){
            System.out.print(num3[i] + ", ");}
            else System.out.print(num3[i] + " ");


        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача №4");
        int[] num1 = new int[3];
        num1 [0] = 1;
        num1 [1] = 2;
        num1 [2] = 3;
        for (int i = 2; i >= 0; i--){
            if(num1[i] % 2 != 0){
                num1[i] = num1[i] + 1;
                System.out.print(num1[i] + ", ");}
            else System.out.print(num1[i] + ", ");
        }
        System.out.println();

        System.out.println();
    }
}
