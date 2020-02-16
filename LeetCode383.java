//赎金信
//给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
//(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
//注意：
//你可以假设两个字符串均只含有小写字母。
//
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true
public class LeetCode383 {
      public static boolean canConstruct(String ransomNote, String magazine){
          int len1 = ransomNote.length();
          int len2 = magazine.length();
          if(len1 > len2) return false;
          int[] count = new int[26];
          char[] ran = ransomNote.toCharArray();
          char[] mag = magazine.toCharArray();
          for(int i = 0;i < len2;i++){
              count[mag[i] - 'a']++;
          }
          for(int i = 0;i < len1;i++){
              count[ran[i] - 'a']--;
          }
          for(int i = 0;i < 26;i++){
              if(count[i] < 0) return false;
          }
          return true;
      }

    public static void main(String[] args) {
        String str1 ="aa";
        String str2 = "ab";
        System.out.println(canConstruct(str1,str2));
    }
}