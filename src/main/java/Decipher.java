//import java.util.Scanner;
//
//public class Decipher {
//    public static StringBuffer decrypt(String text, int shift)
//    {
//        StringBuffer result= new StringBuffer();
//
//        for (int i=0; i<text.length(); i++)
//        {
//            if (Character.isUpperCase(text.charAt(i)))
//            {
//                char ch = (char)(((int)text.charAt(i) - shift - 65) % 26 + 65);
//                result.append(ch);
//            }
//            else
//            {
//                char ch = (char)(((int)text.charAt(i) - shift - 97) % 26 + 97);
//                result.append(ch);
//            }
//        }
//        return result;
//    }
//
//
//    public static void main(String[] args)
//    {
//        Scanner myText = new Scanner(System.in);
//        System.out.println(" Enter your encrypted text" );
//        String text = myText.nextLine();
//        System.out.println(" Enter Shift" );
//        int shift = myText.nextInt();
//        System.out.println("Decipher: " +decrypt(text, shift));
//
//
//    }
//}
//
//
//
//
