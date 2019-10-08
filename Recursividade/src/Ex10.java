/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Ex10 {
        int retNaturaisDec(int n) {
            if(n == -1) {
                    return 0;
            }
            printf("%d ", n);
            retNaturaisDec(n - 1);
            return n;
    }

    int retNaturaisDecSig(int n) {
            if(n < 0) {
                    return retNaturaisDec(n * -1);
            }
            return retNaturaisDec(n);
        }

        private void printf(String d_, int n) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
