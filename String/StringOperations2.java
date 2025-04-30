class StringOperations{
    public static void main(String args[]){
        // two decalration but one object only created
        String s1 = "kamal";
        String s2 = "kamal";
        System.out.println(s1 == s2);
        
        String s3 = "Kamal";
        System.out.println(s3 == s1);
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}    