public class CannonBallPyramid {
    public static int countCannonballs(int height){
        if(height == 0){
            return height;
        }
        int n = (int)Math.pow(height, 2);
        return n + countCannonballs(height-1);
    }
    public static void main(String[] args){
        int heightA = 3;
        System.out.println("The number of cannonballs needed to make a pyramid with a height of " + heightA + " is: " + countCannonballs(heightA));
    }
}
