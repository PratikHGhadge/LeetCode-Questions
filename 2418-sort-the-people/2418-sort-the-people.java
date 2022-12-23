class Solution {
    static class Pair{
        String n;
        int h;
        Pair(String n, int h){
            this.n = n;
            this.h = h;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        Pair[] p = new Pair[names.length];
        for(int i = 0; i<names.length; i++){
            p[i] = new Pair(names[i], heights[i]);
        }
        Arrays.sort(p, (a, b)->{
             return b.h-a.h;
        });
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++){
            res[i] = p[i].n;   
        }
        return res;
    }
}