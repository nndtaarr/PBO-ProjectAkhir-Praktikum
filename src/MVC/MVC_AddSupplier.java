/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Controller.ControllerAddSupplier;
import Model.ModelAddSupplier;
import View.ViewAddSupplier;
/**
 *
 * @author Ardya
 */
public class MVC_AddSupplier {
    public MVC_AddSupplier(){
        ViewAddSupplier viewAddSupplier = new ViewAddSupplier();
        ModelAddSupplier modelAddSupplier = new ModelAddSupplier();
        ControllerAddSupplier controllerAddSupplier = new ControllerAddSupplier(viewAddSupplier,modelAddSupplier);
    }
}
