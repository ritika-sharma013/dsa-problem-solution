class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // create priority queue
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x,0)+1);
        }
        // Using comparator operator.
        PriorityQueue<Integer> q = new  PriorityQueue<>(
            (a,b) -> mp.get(a) - mp.get(b)
            // if a > b -> b would be removed else, a would be removed 
            // from the priority queue
        );

    // unique elements adding in queue 
        for(int x: mp.keySet()){
            q.add(x);

            if(q.size()>k){
                q.poll();
            }
        }
        // creating array -> return the final ans in array 
        int[] ans = new int[k];
        for(int i = 0; i<k; i++){
            ans[i] = q.poll();
        }
  return ans; 
        }

    }
