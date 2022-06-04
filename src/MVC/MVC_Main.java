/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Controller.ControllerMain;
import Model.ModelMain;
import View.ViewMain;
/**
 *
 * @author Ardya
 */
public class MVC_Main {
    ViewMain viewMain = new ViewMain();
    ModelMain modelMain = new ModelMain();
    ControllerMain controllerMain = new ControllerMain(modelMain,viewMain);
}
