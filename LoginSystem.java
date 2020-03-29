import java.util.Arrays;
import java.util.Scanner;

public class LoginSystem {
    public static char[][] named = new char[100][30];
    public static int count = 0;

    public static void login(){
        System.out.println("«Î ‰»Î’À∫≈£∫");
        char[] name = new char[30];
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i=0;i<str.length();i++){
            name[i]=str.charAt(i);
        }
        int num = 0;
        for (int i = 0;i <= count;i++){
            if (Arrays.equals(named[i],name)){
                num++;
                break;
            }
        }
        if (num != 0){
            System.out.println("µ«¬Ω≥…π¶°£");
        }else {
            System.out.println("µ«¬Ω ß∞‹£¨«Î◊¢≤·°£");
            operate();
        }
    }

    public static void register(){
        System.out.println("«Î ‰»ÎœÎ“™◊¢≤·µƒ’À∫≈£∫");
        char[] name = new char[30];
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i=0;i<str.length();i++){
            name[i]=str.charAt(i);
        }
        int num = 0;
        for (int i = 0;i <= count;i++){
            if (Arrays.equals(named[i],name)){
                num++;
                break;
            }
        }
        if (num == 0){
            for (int j = 0;j < name.length;j++){
                named[count][j] = name[j];
            }
            count++;
            System.out.println("◊¢≤·≥…π¶°£");
            operate();
        }else {
            System.out.println("“—◊¢≤·£¨«Îµ«¬º°£");
            operate();
        }
    }

    public static void operate(){
        System.out.println("1.µ«¬º  2.◊¢≤·  3.ÕÀ≥ˆ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                break;
        }
    }

    public static void main(String[] args) {
        operate();
    }
}