import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        printHelloWorld();

//        System.out.println(concat("Java","programming"));

//          int num1=10;
//          int num2=20;
//          int num3=30;
//          int graetest = CompareNumber(num1, num2, num3);
//          System.out.println("The greatest number is: "+ graetest);

//        int n1=10;
//        int n2=20;
//        int n3=30;
//
//        int [] result = calculate(n1,n2,n3);
//        System.out.println("Sum is: "+result[0]);
//        System.out.println("Average is: "+result[1]);

//        int n1=10;
//        int n2=20;
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter operation: ");
//        String operation = s.next();
//
//        int result;
//        result = calculator(n1,n2,operation);
//        System.out.println(n1+" "+operation+" "+n2 +" = "+result);

//        int[] arr = { 2, 3, 3, 2, 1, 5, 4};
//        System.out.print("The unique numbers in the array are: ");
//        printUniqueNumbers(arr);

//        String str ="Hello world";
//        int count = countVowels(str);
//        System.out.println("The number of vowels in "+str+ " is: "+count);

        String str ="Java programming bootcamp is very jun";
        printWords(str);


    }

        public static void printHelloWorld(){
            System.out.println("Hello World");
        }
        public static String concat(String a, String b){
        return a+b;

        }
        public static int CompareNumber(int num1,int num2,int num3){

        int graetest =num1;
        if(num2 > graetest){
            graetest=num2;
        }
        if(num3 > graetest){
            graetest=num3;
        }
        return graetest;

        }
        public static int[] calculate(int n1, int n2, int n3){
        int sum=n1+n2+n3;
        int avg=sum/3;
        int [] result={sum,avg};

        return result;

        }

        public static int calculator(int n1, int n2,String op){
        int result=0;
            switch (op) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n1 / n2;
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
            return result;
        }
        public static void printUniqueNumbers(int[]arr){
            for (int i = 0; i <arr.length ; i++) {
                boolean isUnique = true;
                for (int j = 0; j < arr.length; j++) {
                    if(i != j && arr[i]== arr[j]){
                        isUnique=false;
                        break;
                    }

                }
                if(isUnique){
                    System.out.println(arr[i]+" ");
                }

            }
        }
        public static int countVowels(String str){
        int vowelCount =0;
            for (int i = 0; i <str.length() ; i++) {
                char c = str.charAt(i);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowelCount++;
                }
            }
            return vowelCount;
        }

        public static void printWords(String str){
        String [] words = str.split(" ");
            for (String word:words) {
                System.out.println(word);
            }

        }


    }
