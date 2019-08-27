package MainModule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.awt.Frame;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("ApplicationContext.xml");
        Frame frame=(Frame)context.getBean("frame");
        frame.setVisible(true);
    }
}
