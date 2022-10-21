/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author Michael
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return (a+b);
    }

    @Override
    public Integer subtract(int a, int b) {
        return (a-b);
    }

    @Override
    public Integer multiply(int a, int b) {
        return (a*b);
    }

    @Override
    public Integer divide(int a, int b) {
        return (a/b);
    }

    @Override
    public Integer module(int a, int b) {
        return null;
    }

    @Override
    public Integer exponent(int a, int b) {
        return (int)(Math.pow(a,b));
    }
   
}
