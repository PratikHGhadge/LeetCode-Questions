class NumberContainers {
        HashMap<Integer, TreeSet> numMap;
        HashMap<Integer, Integer> idxMap;
        public NumberContainers() {
            numMap = new HashMap<>();
            idxMap = new HashMap<>();
        }
        public void change(int index, int number) {
            if (idxMap.containsKey(index)){
                int num = idxMap.get(index);
                numMap.get(num).remove(index);
                if (numMap.get(num).size()==0){
                    numMap.remove(num);
                }
            }
            idxMap.put(index, number);
            if (!numMap.containsKey(number)){
                numMap.put(number, new TreeSet());
            }
            numMap.get(number).add(index);
        }
        public int find(int number) {
            if (numMap.containsKey(number)){
                return (int)numMap.get(number).first();
            }
            return -1;
        }
    }

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */