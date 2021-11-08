public class Method_Overloading_Change_no_args_12_1 {
    public static void main(String[] args) {
        add add1=new add();
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        
        int x=add1.addition(a, b, c);
        int y=add1.addition(a,b,c,d);
         System.out.println("val of X="+x+" Val of Y="+y);
     }   
}
class add{
   
    int addition(int a,int b,int c){
        return a+b+c;
        
    }
    int  addition(int a,int b,int c,int d){
        return a+b+c+d;
    }
    
}
