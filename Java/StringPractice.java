class StringPractice {
    public static void main(String[] args) {
        

        String name = "nkdebug"; // string literal pool

        System.out.println(name.hashCode());
        name = name + "009";

        System.out.println(name.hashCode());



        String s1 = new String("nkdebug");
        String s2 = new String("nkdebug");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));




        System.out.println( s1.charAt(3));
        System.out.println( s1.substring(4));

        String s3 = "nkdebug";
        String s4 = "nkdebug";
        System.out.println(s3 == s4);

        System.out.println(s3.equals(s4));
       


    }
}