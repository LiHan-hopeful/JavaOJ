public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> one = new ArrayList<>();
        Arrays.sort(candidates);
        search(one, new ArrayList<>(), candidates, target, 0);
        return one;
    }

public void search(List<List<Integer>> one, List<Integer> two, int[] candidates, int target, int count){
        if(target == 0) {
            List<Integer> vessel = new ArrayList<>(two);
            if(!one.contains(vessel))  {
               one.add(vessel);
            }
        }
        else{
            for(int i=count; i<candidates.length; i++){
                if(target>=candidates[i]){
                    if(two.isEmpty() || two.get(two.size()-1)<=candidates[i]){  
                        two.add(candidates[i]);
                        search(one,two,candidates,target-candidates[i],i+1);
                        two.remove(two.size()-1);
                    }
                    else {
                       continue;
                    }
                }
                else  {
                     break;
               }
            }
        }
    }
