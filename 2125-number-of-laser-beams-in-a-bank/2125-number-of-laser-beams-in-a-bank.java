class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0; 
        int total = 0;
        for(String s: bank){
            int count= (int)s.chars().filter(ch->ch=='1').count();
            total += (count * prev);
            if(count > 0)
                prev = count;
        }
        return total;
    }
}