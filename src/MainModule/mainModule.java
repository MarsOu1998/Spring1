package MainModule;

import Interface.IDISK;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class mainModule {
    public static void main(String[] args) {
        //读取配置文件
        ApplicationContext context=new FileSystemXmlApplicationContext("applicationContext.xml");
        IDISK disk=(IDISK)context.getBean("disk");
        disk.write("Hello");
    }
}
