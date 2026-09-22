import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapST =new HashMap<>();
        HashMap<Character,Character> mapTS =new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(mapST.containsKey(s.charAt(i)) && mapST.get(s.charAt(i))!=t.charAt(i) ||
               mapTS.containsKey(t.charAt(i)) && mapTS.get(t.charAt(i))!=s.charAt(i))
               {
                return false;
               }
           mapST.put(s.charAt(i),t.charAt(i));
           mapTS.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}