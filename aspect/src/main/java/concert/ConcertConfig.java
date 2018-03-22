package concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public Performance performance(){
        return () -> System.out.println("perform.");
    }

    public static void main(String args[]){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConcertConfig.class);
        Performance p = context.getBean(Performance.class);
        p.perform();
    }
}
