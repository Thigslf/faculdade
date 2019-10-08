
import static java.lang.Math.abs;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Ex3 {
    int inverte(int n) {
	if((n / 10) == 0) {
            return n;
	}
	return (int) (inverte(n / 10) + (n % 10) * pow(10, abs(log10(n))));
}
    int inverteSig(int n) {
	if(n < 0) {
        	return -1 * inverte(n * -1);
	}
	return inverte(n);
    }  
}
