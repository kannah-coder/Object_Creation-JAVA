// class calc{
//     int a;

//     public int add(int n1,int n2){
//         System.out.println("in add: ");
//         return n1+n2;
//     }
// }
// public class object {
//     public static void main(String [] args){
//         int num1=4;
//         int num2=5;
//         calc c=new calc();
//         int result=c.add(num1,num2);
//         System.out.println(result);
      
        
//     }
// }

class Calc{
    int a;
    public void add(int n1,int n2){
        System.out.println("ADD: "+ (n1+n2));

    }

}
public class object{
    public static void main(String[] args) {
        int num1=23;
        int num2=56;
        Calc c=new Calc();
        //Non primitive datatype
        c.add(num1,num2);
            
}

}
 