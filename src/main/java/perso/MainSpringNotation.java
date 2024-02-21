package perso;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringNotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("idao","metier");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.getCalcule());
    }
}
