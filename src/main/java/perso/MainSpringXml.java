package perso;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringXml {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println(metier.getCalcule());
    }
}
