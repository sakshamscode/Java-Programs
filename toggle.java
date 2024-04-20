public class toggle {
    public static void main(String[] args) {
        String sb="sAkShAm SiNgH";
        String s="";

        for(int i=0;i<sb.length();i++) {
            int ascii = sb.charAt(i);
            if (ascii == 32) {
                s=s+" ";
                continue;
            }
            if (ascii >= 97) {
                ascii = ascii - 32;
                char ch = (char) ascii;
                s = s+ch;
            } else {
                ascii = ascii + 32;
                char ch = (char) ascii;
                s = s+ch;
            }
        }
        System.out.println(s);

    }
}
