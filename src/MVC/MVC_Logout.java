/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Controller.ControllerLogout;
import View.ViewLogout;
/**
 *
 * @author Ardya
 */

public class MVC_Logout {
    public MVC_Logout(){
        ViewLogout viewLogout = new ViewLogout();
        ControllerLogout controllerLogout = new ControllerLogout(viewLogout);
    }
}
