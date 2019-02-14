/* Author: Ken Henkel
 * Course: CUS1126
 * Date: 2/14/19
 */
public class CannonBallPyramid {
    public static void main(String[] args){
        int heightA = 3;
        int heightB = 4;
        int heightC = 5;
        System.out.println("The number of cannonballs needed to make a pyramid with a height of "
                + heightA + " is: " + countCannonballs(heightA));
        System.out.println("The number of cannonballs needed to make a pyramid with a height of "
                + heightB + " is: " + countCannonballs(heightB));
        System.out.println("The number of cannonballs needed to make a pyramid with a height of "
                + heightC + " is: " + countCannonballs(heightC));
    }
    public static int countCannonballs(int height){
        if(height == 0){
            return height;
        }
        int n = (int)Math.pow(height, 2);
        return n + countCannonballs(height-1);
    }

}
