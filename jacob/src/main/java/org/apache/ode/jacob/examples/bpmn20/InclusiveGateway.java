package org.apache.ode.jacob.examples.bpmn20;

import org.apache.ode.jacob.examples.bpmn20.event.NodeFactory;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 3:46:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class InclusiveGateway extends Gateway {
    NodeFactory _nodeFac;

    public InclusiveGateway(NodeFactory nodeFac, List<SequenceFlow> incomingsf, List<SequenceFlow> outgoingsf) {
        super(incomingsf, outgoingsf);
        _nodeFac = nodeFac;
    }
    public void run() {
        System.out.println(this.getClassName());
    }
}
