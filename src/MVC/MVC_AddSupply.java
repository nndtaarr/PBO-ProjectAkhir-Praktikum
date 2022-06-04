/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Controller.ControllerAddSupply;
import Model.ModelSupply;
import View.ViewAddSupply;

/**
 *
 * @author Ardya
 */

public class MVC_AddSupply {
    public MVC_AddSupply(){
        ViewAddSupply viewAddSupply = new ViewAddSupply();
        ModelSupply modelSupply = new ModelSupply();
        ControllerAddSupply controllerAddSupply = new ControllerAddSupply(viewAddSupply,modelSupply);
    }
}
