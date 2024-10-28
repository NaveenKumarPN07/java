class Gen<T>{
 T ob;
 Gen(T o){
  ob = o;
 }
T getOb(){
   return ob;
}
void showType(){
  System.out.println("Type of T is " + ob.getClass().getName());
  }
}
class gendemo{
public static void main(String args []){
 Gen <Integer>iob;
 iob = new Gen<Integer>(56);
iob.showType();
int V = iob.getOb();
System.out.println("autounboxing value is " +" " + V);

  }
}



.....................................



class twogen<V ,T>{
   V ob1;
   T ob2;
  twogen(V o1 , T o2){
   ob1 = o1;
   ob2 = o2;
  }
  V getOb1(){
    return ob1;
}
  T getOb2(){
  return ob2;
}
void showType(){  
   System.out.println(" Type of V is " +" " + ob1.getClass().getName());
   System.out.println(" Type of T is " +" " + ob2.getClass().getName());
   }
}



class gendemo1{

  public static void main(String args[]){
 
     twogen <Integer,Double> K = new twogen<Integer , Double>(90 , 90.78);
     K.showType();
     int V = K.getOb1();
     double T = K.getOb2();
     System.out.println(" unboxing value is " + V);
     System.out.println(" unboxing value is " + T);
 }
}
