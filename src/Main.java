import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static StringBuilder isTextMirrored(String text){
        text = text.toLowerCase();
        StringBuilder result = new StringBuilder();
        result.append("");
        int length = text.length();
        if (text.length()%2 == 0){
            for (int i = 0; i < length/2; i++) {
                if (text.charAt(i) == (text.charAt(length-i-1)))
                {
                    result.append(text.charAt(i));
                }else {
                    break;
                }
            }
        }else {
            for (int i = 0; i < length/2; i++) {
                if (text.charAt(i) == (text.charAt(length-i-1)))
                {
                    result.append(text.charAt(i));
                }else {
                    break;
                }
            }
        }
        return result;
    }
    public static int numberOfWordsEndingWithYOrZ(String text){
        int count = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            int index = words[i].length()-1;
            if (words[i].charAt(index) == 'y' || words[i].charAt(index) == 'z'){
                count++;
            }
        }
        return count;
    }
    public static StringBuilder makeExclamationMarkTriangle(int n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                result.append('!');
            }
            result.append("\n");
        }
        return result;
    }
    public static void makeTxtFileWithExclamationMarkTriangle(int n){
        String text = makeExclamationMarkTriangle(n).toString();
        try {
            PrintStream ps = new PrintStream("triangle.txt");
            ps.print(text);
            ps.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static String makeSquare (int n){
        StringBuilder result = new StringBuilder();
        //Първи ред
        result.append("? ");
        for (int i = 0; i < n-2; i++) {
            result.append("- ");
        }
        result.append("?");
        result.append("\n");
        //Средни редов
        for (int i = 0; i < n-2; i++) {
            result.append("| ");
            for (int j = 0; j < n-2; j++) {
                result.append("- ");
            }
            result.append("|");
            if (i != n-3){
                result.append("\n");
            }
        }
        if (n-2 != 0){
            result.append("\n");
        }
        //Последен ред
        result.append("? ");
        for (int i = 0; i < n-2; i++) {
            result.append("- ");
        }
        result.append("?");

        return result.toString();
    }
    public static void printGlasses (int n){
        //Първи ред
        for (int i = 0; i < n*2; i++) {
            System.out.print('*');
        }
        for (int i = 0; i < n; i++) {
            System.out.print(' ');
        }
        for (int i = 0; i < n*2; i++) {
            System.out.print('*');
        }
        System.out.println();
        System.out.print('*');
        for (int i = 0; i < n*2-2; i++) {
            System.out.print('/');
        }
        System.out.print('*');
        for (int i = 0; i < n; i++) {
            System.out.print('/');
        }
        System.out.print('*');
        for (int i = 0; i < n*2-2; i++) {
            System.out.print('/');
        }
        System.out.print('*');
        System.out.println();
        for (int i = 0; i < n-3; i++) {
            System.out.print('*');
            for (int j = 0; j < n*2-2; j++) {
                System.out.print('/');
            }
            System.out.print('*');
            for (int j = 0; j < n; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int j = 0; j < n*2-2; j++) {
                System.out.print('/');
            }
            System.out.print('*');
        }
        if (n-3 != 0){
            System.out.println();
        }

        //Последен ред
        for (int i = 0; i < n*2; i++) {
            System.out.print('*');
        }
        for (int i = 0; i < n; i++) {
            System.out.print(' ');
        }
        for (int i = 0; i < n*2; i++) {
            System.out.print('*');
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ex2
//        System.out.println("Enter some text:");
//        String text = sc.next();
//        String result = isTextMirrored(text).toString();
//        if (!result.equals("")){
//            System.out.println(result);
//        }else {
//            System.out.println("No mirrored part.");
//        }

        //ex3
//        System.out.println("Enter some text:");
//        String text = sc.nextLine();
//        int result = numberOfWordsEndingWithYOrZ(text);
//        System.out.print(result);

        //ex4
//        System.out.println("Enter a number:");
//        int n = sc.nextInt();
//        StringBuilder result = makeExclamationMarkTriangle(n);
//        System.out.println(result);
//        makeTxtFileWithExclamationMarkTriangle(n);

        //ex5
//        System.out.println("Enter a number:");
//        int n = sc.nextInt();
//        String square = makeSquare(n);
//        System.out.println(square);

        //ex6
        System.out.println("Enter n:");
        int n = sc.nextInt();
        printGlasses(n);
    }
}