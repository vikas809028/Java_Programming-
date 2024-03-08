//********************************************* SUBSET OF STRING ***********************************
public class Subset{

  public static void findSubset(String str ,String newStr, int index){

    //base case
  if(index == str.length()){
    System.out.println(newStr);
    return;
  }
    
  findSubset(str,newStr+str.charAt(index), index+1);
  findSubset(str,newStr, index+1);

  }
  public static void main(String[] args) {
    String str = "abc";
    findSubset(str,"",0); 
  }
}


     