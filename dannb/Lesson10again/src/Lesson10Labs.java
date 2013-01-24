import java.util.Arrays;

public class Lesson10Labs {
    // Your task is to identify the complexity of this function, and rewrite it to have a better complexity.
    static void FirstLab()
    {
        // Instantiate and populate an array of 10 random floats.
        float[] array = new float[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = (float)Math.random();
        }
        
        System.out.println("Array: " + Arrays.toString(array));
        
        for (int i = 0; i < 10; i++)
        {
            float thisValue = array[i];
            float total = 0.0f;
            for (int j = 0; j < 10; j++)
            {
                total += array[j];
            }
            float average = total / 10.0f;
            System.out.println("Value " + thisValue + " is " + (thisValue / average) * 100.0f + "% of the average.");
        }       
    }
    
    /** Make this code faster. */
    static void SecondLab()
    {
        // Instantiate and populate an array of 10 random integers between 0 and 9.
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = (int)(Math.random() * 10.0);
        }
        
        System.out.println("Array: " + Arrays.toString(array));
        
        for (int i = 0; i < 10; i++)
        {
            int thisValue = array[i];
            boolean isDuplicate = false;
            for (int j = 0; j < 10; j++)
            {
                if ((i != j) && (thisValue == array[j]))
                {
                    isDuplicate = true;
                }
            }
            
            if (isDuplicate)
            {
                System.out.println("Value " + thisValue + " is a duplicate.");
            }
            else 
            {
                System.out.println("Value " + thisValue + " is not a duplicate.");
            }
        }       
    }
    
    static void ThirdLab() 
    {
        // Assignment: Print the first N fibonacci numbers recursively, how fast is this?
        int n = 10;
    }
    
    static void FourthLab() 
    {
        // Assignment: Print the first N fibonacci numbers taking advantage of memoization. How fast is this?
        int n = 10;
    }
    
    static final int EXP_CACHE_SIZE = 100;
    static float exp_cache[] = new float[EXP_CACHE_SIZE];
    
    /** Initializes a cache of exp() results for quantized values between 0 and 1.0. */
    void initExpCache()
    {
        for (int i = 0; i < EXP_CACHE_SIZE; i++) {
            exp_cache[i] = (float) Math.exp(-((float)i / (float)EXP_CACHE_SIZE));
        }
    }

    /** Computes an approximation of the exp() function from a pre-computed cache, if possible.
     * Falls back to Math.exp() if the range if the cache is exceeded.
     * @param a The input value to compute the exp() of.
     * @return A fast approximation of exp(a).
     */
    double fast_exp(double a)
    {
        int idx = (int)(-a * EXP_CACHE_SIZE);
        if (idx > 0 && idx < EXP_CACHE_SIZE) {
            return exp_cache[idx];
        } else {
            return Math.exp(a);
        }
    }
    
    public static void main(String[] args)
    {
        //FirstLab();
        //SecondLab();
        //ThirdLab();
        //FourthLab();
    	
    	IntNode node1 = new IntNode(1);
    	IntNode node2 = new IntNode(2);
    	IntNode node3 = new IntNode(3);
    	
    	node1.setLeftChild(node2);
    	node2.setLeftChild(node3);
    	node3.setLeftChild(node1);
    	
    	IntBST cyclical = new IntBST();
    	cyclical.setRootNode(node1);
    	cyclical.printTree();
    	
    	
    }
}
