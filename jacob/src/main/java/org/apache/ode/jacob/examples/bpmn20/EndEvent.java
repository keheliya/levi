package org.apache.ode.jacob.examples.bpmn20;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 4:01:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class EndEvent extends Event {
    public EndEvent() {
        super();
    }
    
    public void run() {
        System.out.println(this.getClassName());
    }
}
