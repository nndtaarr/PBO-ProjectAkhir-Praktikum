/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Controller.ControllerEditSupply;
import Model.ModelSupply;
import View.ViewEditSupply;

/**
 *
 * @author Ardya
 */
public class MVC_EditSupply {
    ViewEditSupply viewEditSupply = new ViewEditSupply();
    ModelSupply modelSupply = new ModelSupply();
    ControllerEditSupply controllerEditSupply = new ControllerEditSupply(viewEditSupply, modelSupply);
}
