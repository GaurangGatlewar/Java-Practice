import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums){
            if(map.containsKey(i)){
                count = map.get(i)+1;
            } else {
                count = 1;
            }
            map.put(i, count);
        }

        HashSet<List<Integer>> answer = new HashSet<>();
        List<Integer> temp = new ArrayList<Integer>();
        Integer[] numList = map.keySet().toArray(new Integer[map.size()]);
        if (map.containsKey(0)){
            if (map.get(0)>2){
                temp.add(0);
                temp.add(0);
                temp.add(0);
                answer.add(temp);
            }
        }

        for(int i=0;i<numList.length;i++){
            if (map.get(numList[i])>1){
                int num = numList[i]*(-2);
                if(num==0) continue;
                if (map.containsKey(num)){
                    temp = new ArrayList<Integer>();
                    if(num>numList[i]){
                        temp.add(numList[i]);
                        temp.add(numList[i]);
                        temp.add(num);
                    } else {
                        temp.add(num);
                        temp.add(numList[i]);
                        temp.add(numList[i]);
                    }
                    answer.add(temp);
                }
            }
        }

        for(int i=0;i<numList.length;i++){
            for(int j=i+1;j<numList.length;j++){
                int num = -numList[i]-numList[j];
                if(map.containsKey(num)){
                    if((num != numList[i]) && (num != numList[j])){
                        temp = new ArrayList<Integer>();
                        if(num<numList[i] && num<numList[j]){
                            temp.add(num);
                            if(numList[i]<numList[j]){
                                temp.add(numList[i]);
                                temp.add(numList[j]);
                            } else {
                                temp.add(numList[j]);
                                temp.add(numList[i]);
                            }
                        } else if(numList[i]<numList[j]){
                            temp.add(numList[i]);
                            if(num<numList[j]){
                                temp.add(num);
                                temp.add(numList[j]);
                            } else {
                                temp.add(numList[j]);
                                temp.add(num);
                            }
                        } else {
                            temp.add(numList[j]);
                            if(num<numList[i]){
                                temp.add(num);
                                temp.add(numList[i]);
                            } else {
                                temp.add(numList[i]);
                                temp.add(num);
                            }
                        }
                        answer.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> resultList = new ArrayList<>(answer);
        return resultList;
    }
}