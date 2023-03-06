class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<Integer, ArrayList<String>> map = new HashMap<>();
        int n = cpdomains.length;
        for(int i = 0; i<n; i++){
            String[] arr = cpdomains[i].split(" ");
            int count = Integer.parseInt(arr[0]);
            String[] arr2 = arr[1].split("\\.");
            List<String> list = new ArrayList<>();
            if(arr2.length==2){
                list.add(arr2[1]);
                list.add(arr[1]);
            }else{
                list.add(arr2[2]);
                list.add(arr2[1]+"."+arr2[2]);
                list.add(arr[1]);
            }
           if (!map.containsKey(count)){
               map.put(count, new ArrayList<>());
            }
            map.get(count).addAll(list);
        }
        Map<String, Integer> freq = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<String>> e : map.entrySet()){
            for(String str : e.getValue()){
                if(!freq.containsKey(str)){
                    freq.put(str, e.getKey());
                }else{
                    freq.put(str, freq.get(str)+e.getKey());    
                }
                
            }
        }
        
        for(Map.Entry<String, Integer> e : freq.entrySet()){
            String temp = e.getValue()+" "+e.getKey();
            ans.add(temp);
        }
        
        return ans;
    }
}