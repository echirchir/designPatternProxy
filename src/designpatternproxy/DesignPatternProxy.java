/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternproxy;

import designpatternproxy.proxyclasses.Proxy;

public class DesignPatternProxy {

    public static void main(String[] args) {
        System.out.println("Proxy design pattern example");
        
        Proxy proxy = new Proxy();
        
        proxy.doSomeWork();
    }
    
    //Remote proxy - hide the actual object in a different address space
    //Virtual proxy - perform optimization techniques like create actual objects on demand 
    //Protection proxy - deal with different access rights
    //Smart Reference - housekeeping work like total reference counts of actual object
    
}
