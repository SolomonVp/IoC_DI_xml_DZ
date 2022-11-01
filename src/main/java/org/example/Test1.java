package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Owner owner = context.getBean("myOwner", Owner.class);
        owner.poraDomoy();

        System.out.println(owner.color + " " + owner.maxSpeed);
        context.close();

    }
}
