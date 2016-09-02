/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternproxy.originalclasses;

/**
 *
 * @author rocket
 */
public class ConcreteSubject extends Subject{

    @Override
    public void doSomeWork() {
        System.out.println("I am from concrete subject.");
    }
    
}
