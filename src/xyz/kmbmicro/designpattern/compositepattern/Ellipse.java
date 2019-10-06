package xyz.kmbmicro.designpattern.compositepattern;

/**
 * "Leaf"
 */
class Ellipse implements Graphic {
    //Prints the graphic.
    @Override
    public void print() {
        System.out.println("Ellipse");
    }
}