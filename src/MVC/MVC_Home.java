/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Controller.ControllerHome;
import View.ViewHome;

/**
 *
 * @author Ardya
 */

public class MVC_Home {
    public MVC_Home() {
        ViewHome viewHome = new ViewHome();
        ControllerHome controllerHome = new ControllerHome(viewHome);
    }
}
