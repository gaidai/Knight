
package com.sgaidai.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.io.FileNotFoundException;


public class Main {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
       // FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/sgaidai/knights.xml");
        Knight knight = (Knight) context.getBean("knight");
        
        knight.embarkOnQuest();
    }

    
}
