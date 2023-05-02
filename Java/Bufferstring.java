public class Bufferstring {
    
        public static void main(String[] args) {
            
            // mutable
            StringBuffer sb = new StringBuffer("nkdebug");
            sb.append("009");
    
            sb.insert(0, "Angular");
    
            System.out.println(sb);
    
            System.out.println(sb.capacity());
    
            String s1 = sb.toString();
        }
    
}
