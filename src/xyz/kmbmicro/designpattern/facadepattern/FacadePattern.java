package xyz.kmbmicro.designpattern.facadepattern;/* Complex parts */

/* Client */
public class FacadePattern {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}