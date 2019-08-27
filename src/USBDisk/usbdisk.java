package USBDisk;

import Interface.IDISK;

public class usbdisk implements IDISK {
    public String read(){
        return "U盘读入";
    }

    public void write(String message){
        System.out.println("U盘写入:"+message);
    }
}
