class Day2_RevereseString{

    //reverse string
    public static String reverseString(String s){
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);

    }


    public static void main(String args[]){
        String s="hello";
        System.out.println(reverseString(s));


        
    }
}