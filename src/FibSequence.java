/**
 * Created by tjz on 9/12/13.
 */
public class FibSequence {
    public int numberAtPosition(int sequenceNumber) {
        int[] array = new int[sequenceNumber + 1];
        if(sequenceNumber == 1 || sequenceNumber ==2)
            return 1;
//        else if(sequenceNumber == 1 )
//            return 1;
        else {
            array[0] = 0;
            array[1] = 1;
        }
        for(int i = 2; i <= sequenceNumber; i++){
            array[i] = array[i - 1] + array[i - 2];

        }

        /*
        TODO:
        * Input: nth number given as an integer
        * Create an array n long, the first two values should be 0,1
        * Build the array by adding the two previous numbers to each other
        * Print the last number in the array
         */
        return array[sequenceNumber];
    }
}