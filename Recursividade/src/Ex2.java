/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Ex2 {
   int fibonacci(int n) {
	if(n < 2) {
            return 1;
	}
	return fibonacci(n - 1) + fibonacci(n - 2);
    } 
}
