/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgaidai.knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main {
    
    public static void main(String[] args) {
        // Загрузка контекста Spring
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/knights.xml");
        // Получение компонента knight
        Knight knight = (Knight) context.getBean("knight");
        // Использование компонента knight
        knight.embarkOnQuest();
    }

    
}
