/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author Michael
 */
@Local
public interface calcbeanLocal {

    Integer addition(int a, int b);

    Integer subtract(int a, int b);

    Integer multiply(int a, int b);

    Integer divide(int a, int b);

    Integer module(int a, int b);

    Integer exponent(int a, int b);
    
}
