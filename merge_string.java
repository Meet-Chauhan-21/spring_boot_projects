import java.util.Scanner;

public class merge_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your first string : ");
        String s1 = sc.nextLine();
        System.out.print("Enter your Second string : ");
        String s2 = sc.nextLine();
        System.out.println("combine string : "+ s1 + " " + s2);

        char c1 = 'a';
        char c2 = 'b';

        for(int i = 0; i<1; i++){
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
        }


        String c = Character.toString(c1);
        String d = Character.toString(c2);

        String str1 = c.concat(d);
        System.out.println("String 1 : "+ str1);

        String replace1 = "";
        String replace2 = "";

        for (int i = 0; i < 1; i++) {
            replace1 = s1.replace(c, "");
            replace2 = s2.replace(d,"");
        }

        String str2 = replace1.concat(replace2);
        System.out.println("String 2 : "+ str2);

        String main_string = str1.concat(str2);

        System.out.println("output : "+ main_string);
    }
}
