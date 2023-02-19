package leetcode;

/*
 * @author Alex
 * @version 1.0
 */
public class _383 {
    public static void main(String[] args) {
        String s1="aaa";
        String s2="aab";
        String[] split = s1.split("");

        System.out.println(canConstruct(s1,s2));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] flag=new int[magazine.length()];
        for (int i = 0; i < ransomNote.length(); i++) {
            int k=0;
            for (int j=0;j<magazine.length();j++){
                if (ransomNote.charAt(i)==magazine.charAt(j)){
                    if (flag[j]==0){
                        flag[j]=1;
                        k=1;
                        break;
                    }
                }
            }
            if (k==0){
                return false;
            }
        }
        return true;
    }
}
