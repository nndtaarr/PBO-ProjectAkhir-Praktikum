/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Controller.ControllerSupply;
import Model.ModelSupply;
import View.ViewSupply;
/**
 *
 * @author Ardya
 */
public class MVC_Supply {
    ViewSupply viewSupply = new ViewSupply();
    ModelSupply modelSupply = new ModelSupply();
    ControllerSupply controllerSupply = new ControllerSupply(viewSupply, modelSupply);
}
