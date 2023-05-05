package br.com.hsalomao.springboottree.node;

import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class NodeService {

    public String findAll() {
        Node f = new Node("F", null, null);
        Node e = new Node("E", null, null);
        Node d = new Node("D", null, null);
        Node c = new Node("C", f, null);
        Node b = new Node("B", c, e);
        Node a = new Node("A", b, d);
        StringBuilder sb = new StringBuilder();
        print(sb, a);
        System.out.println(sb.toString());
        return sb.toString();
        
    }

    private void print(StringBuilder sb, Node node) {
        if (Objects.nonNull(node)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }

            sb.append("{label:\"").append(node.getLabel()).append("\"");
            
            if (Objects.nonNull(node.getLeft())) {
                sb.append(", left:\"").append(node.getLeft().getLabel()).append("\"");
            }

            if (Objects.nonNull(node.getRight())) {
                sb.append(", rigth:\"").append(node.getRight().getLabel()).append("\"");
                
            }
            sb.append("}");

            print(sb, node.getLeft());
            print(sb, node.getRight());           
        }
    }
    
}
