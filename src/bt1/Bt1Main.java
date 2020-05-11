package bt1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Bt1Main 
{
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        
        HoaDon hoaDon = new HoaDon.HoaDonBuilder()
                            .setHeader(new HoaDonHeader("HD00001", formatDate.parse("27/07/1999"), "Vo Ngoc Khoa"))
                            .addDsCTDH(new CTHD("ba lo hang hieu", 1, 100000, 10))
                            .addDsCTDH(new CTHD("tui xach hang hieu", 2, 200000, 10))
                            .addDsCTDH(new CTHD("giay hang hieu", 3, 300000, 10))
                            .addDsCTDH(new CTHD("ca vat hang hieu",4 , 400000, 10))
                            .build();
        System.out.println(hoaDon.toString());
    }
    
}
