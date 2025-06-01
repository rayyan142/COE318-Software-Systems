package coe318.lab3;

 /*@author Rayyan Faisal*/

public class Counter {
    int modulus, digit;
    Counter left;
    //Instance variables here
    
    public Counter(int modulus, Counter left) {
        this.modulus = modulus;
        this.left = left;
        this.digit = 0;  
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return left;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        
        if(digit >= 0 && digit < modulus){
            this.digit = digit;
        }
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        digit++;
        if(digit == modulus){
            digit = 0;
            if(left != null){
                left.increment();
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(left != null){
            return left.getCount() * modulus + digit;
        }
        else{
            return digit;
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbor).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }
}