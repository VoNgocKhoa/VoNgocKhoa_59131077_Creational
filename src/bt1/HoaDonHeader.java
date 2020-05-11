package bt1;
import java.util.Date;
import java.text.SimpleDateFormat;

public class HoaDonHeader {
    String maHoaDon;
    Date ngayBan;
    String tenKH;

    public HoaDonHeader(String maHoaDon, Date ngayBan, String tenKH) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "Thông tin chung: " + "Mã hóa đơn: " + maHoaDon
               + ", ngày bán: " + new SimpleDateFormat("dd/MM/yyy").format(ngayBan)
               + ", tên KH: " + tenKH;
    }
    
}
