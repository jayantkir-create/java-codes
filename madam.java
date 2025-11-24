public class madam {
    public static boolean ispalindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i) != name.charAt(name.length()-1-i)){
                System.out.println("not a palindrome");
            //palindrome
                return false;
            }
            
        }
        return true;    
    }
    public static void main(String[] args) {
        String name="madam";
        System.out.println(ispalindrome(name));
    }
}