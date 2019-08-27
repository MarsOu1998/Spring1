package MoveDisk;

import Interface.IDISK;

public class movedisk implements IDISK {
    public String read(){
        return "移动硬盘读入";
    }
    public void write(String message){
        System.out.println("移动硬盘写入:"+message);
    }
}
