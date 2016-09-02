/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternproxy.proxyclasses;

import designpatternproxy.originalclasses.ConcreteSubject;
import designpatternproxy.originalclasses.Subject;

/**
 *
 * @author rocket
 */
public class Proxy extends Subject{
    
    ConcreteSubject subject;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now!");
        
        if(subject == null){
            subject = new ConcreteSubject();
        }
        
        subject.doSomeWork();
        
    }
    
}
