package com.kh.day14.listcollection;

public class intList {

    private  int [] nums;
    private  int current;
    private int size;
    public intList(){
        nums = new int[3];
        current = 0;
        size = 0;
    }

        public void add(int input){
        //int input = 3
        // 꽉차있는 상태라면 크기 재할당 배열 생성
        if(size == nums.length){
//            resize();
        }

            nums[current] = input;
            current++;
        }
        public int get(int index){
        return nums[index];
        }
        public int size(){
        return current;
        }

        public void clear(){
        nums = new int[3];
        current = 0;
        }


}
