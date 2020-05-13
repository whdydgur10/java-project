package Day15;

public class Test15_1 {

	public static void main(String[] args) {
		Data d = new Data();
        d.x = 10;
        
        System.out.println("main:x="+ d.x);
        System.out.println();
        change (d.x);
        //d.x라는 변수
        System.out.println("change(d.x) 이후 :" + d.x);
        System.out.println();
        change2(d);
        //d라는 객체
        System.out.println("change2(d) 이후 :" + d.x);
        
}
private static void change(int x) {
	//매개변수
  x=1000;
  //x라는 변수값을 바꿔줌
  System.out.println("change x=" +x);
  
}

private static void change2(Data d) {
	//참조변수
   d.x =1000;
   //d라는 객체의 주소값을 바꿔줌
   System.out.println("change2 d.d="+ d.x);

	}

}
class Data{
    int x;
    }
