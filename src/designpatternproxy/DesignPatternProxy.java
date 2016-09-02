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
    
}
