package RecursionPart2;

public class RemoveDuplicate {
    public static void removeDuplicates(String str, int idx , StringBuilder newstr, Boolean map[]){
        // it can be done also using String datatype
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char newchar = str.charAt(idx);
        
        // here always a will be subtracted because when we subtract a from map we will get index of that char to check its already presence
        if(map[newchar-'a'] == true){
            removeDuplicates(str, idx+1, newstr, map);
        }
        else{

            //--------------------used with String datatype---------------
            //newstr = newstr.concat(newchar); it will not work because we are concating string and char
            // newstr = newstr+newchar; 
            
            map[newchar - 'a'] = true; // Update map to mark the character as encountered
            removeDuplicates(str, idx+1, newstr.append(newchar), map);
        }

    }
    public static void main(String[] args) {
        String str = "appnacollege";
        Boolean[] map = new Boolean[26];
        for (int i = 0; i < map.length; i++) {
            map[i] = false; // Initialize all elements to false
        }
        StringBuilder newstr = new StringBuilder("");
        removeDuplicates(str, 0, newstr , map);
    }
}
    
