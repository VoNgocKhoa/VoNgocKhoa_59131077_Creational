package bt1;
import java.util.ArrayList;
public class HoaDon 
{
    HoaDonHeader header;
    ArrayList<CTHD> dsCTDH;

    protected HoaDon(HoaDonBuilder builder) {
        this.header = builder.header;
        this.dsCTDH = builder.dsCTDH;
    }

    @Override
    public String toString() {
        String str = header.toString();

        for (CTHD ct : dsCTDH) {
            str += "\n" + ct.toString();
        }
        return str;
    }
    
    // Builder class
    public static class HoaDonBuilder {
        HoaDonHeader header;
        ArrayList<CTHD> dsCTDH;

        public HoaDonBuilder() {
            this.dsCTDH = new ArrayList<>();
        }
        
    // set header cho hóa đơn
        public HoaDonBuilder setHeader(HoaDonHeader header) {
            this.header = header;
            return this;
        }
    // add sản phẩm vào dsCTHD
        public HoaDonBuilder addDsCTDH(CTHD cthd) {
            this.dsCTDH.add(cthd);
            return this;
        }
    // build ra 1 hóa đơn
        public HoaDon build() {
            return new HoaDon(this);
        } 
        
    }
}
