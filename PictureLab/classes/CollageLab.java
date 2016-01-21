

/**
 * Write a description of class CollageLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollageLab extends SimplePicture
{

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
     public static void main(String[] args)
    {
        // put your code here
        Picture original = new Picture(660,994);
        Picture hedgehog = new Picture("hedgehog2.jpg");
        Picture hedgehog3 = new Picture("hedgehog2.jpg");
        Picture hedgehog2 = new Picture("hedgehog2.jpg");
        Picture otter = new Picture("otter.jpg");
        hedgehog.explore();
        hedgehog.mirrorVerticalRightToLeft();
        hedgehog2.cropAndCopy(otter, 0, 254, 0, 193 , 77, 0);
        hedgehog.grayscale();
        hedgehog.negate();
        original.copy(hedgehog,0,0);
        hedgehog2.cropAndCopy(otter, 0, 254, 0, 193 , 77, 0);
        original.copy(hedgehog2,0, 497); 
        hedgehog2.setBlue();
        hedgehog2.negate();
        original.copy(hedgehog2,330, 0);
        otter.setRed();
        hedgehog3.cropAndCopy(otter, 0, 254, 0, 193 , 77, 0);
        hedgehog3.grayscale();
        original.copy(hedgehog3,330,497);
        original.explore();
        original.write("MyCollage.jpg");
    }

}
