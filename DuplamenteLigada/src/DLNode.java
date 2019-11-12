/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class DLNode {
    Object val;
    DLNode prev;
    DLNode next;
    
    DLinkedNode(Object v, DLNode p, DLNode n){
        val = v;
        prev = p;
        next = n;
            
    }   
    
}
