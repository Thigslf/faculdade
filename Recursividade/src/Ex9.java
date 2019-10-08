/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Ex9 {
    private int x;
    int retNaturais(int n) {      
          if(n == -1) {
                  return 0;
          }
          int retNaturais = 1 + x (n - 1);
          printf("%d ", n);
        return n;
  }

  int retNaturaisSig(int n) {
          if(n < 0) {
                  return retNaturais(n * -1);
          }
          return retNaturais(n);
      }  

      private void printf(String d_, int n) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      private int x(int i) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
  }
