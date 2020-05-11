package bt2;
public class MyStringBuilder 
{
    //- str: Thuộc tính có kiểu String.
    String str;

    public MyStringBuilder(String str) 
    {
        this.str = str;
    }
    //Phương thức addString(String s): Thêm chuỗi s vào sau chuỗi str và trả về kiểu
    //MyStringBuilder.
    public MyStringBuilder addString(String s) 
    {
        str += s;
        return this;
    }
    //Phương thức addFloat(float f): Thêm số s vào sau chuỗi str và trả về kiểu
    //MyStringBuilder.

    public MyStringBuilder addFloat(float f) 
    {
        str += f;
        return this;
    }
    //Phương thức addBool(boolean b): Thêm giá trị b vào sau chuỗi str và trả về
    //kiểu MyStringBuilder
    public MyStringBuilder addBool(boolean b) 
    {
        str += b;
        return this;
    }
    //Phương thức toString() trả về chuỗi str đã được xây dựng.

    @Override
    public String toString() {
        return str;
    }
}
