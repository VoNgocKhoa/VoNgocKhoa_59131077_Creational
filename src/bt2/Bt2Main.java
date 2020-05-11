package bt2;
public class Bt2Main 
{
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder("DESIGN")
                                .addString("PATTERN")
                                .addString(" CNTT2 ")
                                .addFloat(1.1f)
                                .addBool(true);

        str.addString("DESING PATTERN CNTT2 ");
        System.out.println(str.toString());
        System.out.println(str);
    }
}
