class da{
    int a1 = 1000;
}
    
    
class ma extends da{
    int a2 = 10000;	
}
    
class aa extends ma{
    void show(){
        int res = a1 + a2;
        System.out.println("res = "+res);
    }
}

class InhertCode2{
    public static void main(String args[]){
        aa a = new aa();
        a.show();
    }
}