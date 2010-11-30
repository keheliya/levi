package org.apache.ode.jacob.examples.bpmn20;

import org.apache.ode.jacob.examples.bpmn20.event.NodeFactory;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 3:46:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComplexGateway extends Gateway {
    NodeFactory _nodeFac;

    public ComplexGateway(NodeFactory nodeFac) {
        super();
        _nodeFac = nodeFac;
    }
    
    public void run() {
        System.out.println(this.getClassName());
    }
}