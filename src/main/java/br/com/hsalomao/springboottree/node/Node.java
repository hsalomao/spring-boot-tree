package br.com.hsalomao.springboottree.node;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Node {

    @NonNull
    String label;
    Node left, right;
}
