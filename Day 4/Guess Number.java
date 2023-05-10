/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
      if(n == 1) return 1;
        if(guess(n)==0) return n;

        int first = 1, last = n;
        int mid;

        while(first<last){
            mid = first+(last-first)/2;
            int temp = guess(mid);
    
            if(temp==0) return mid;
            else if(temp==-1) last = mid;
            else first = mid;
        }
        return 0;  
    }
}
