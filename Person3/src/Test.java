
public class Test {

	public static void main(String[] args){

		Person taro =new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="東京";
		taro.mail="aaa@aaaa";
		taro.seibetu="男";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(taro.mail);
		System.out.println(taro.seibetu);

		Person a =new Person();
		a.name="木村次郎";
		a.age=18;
		a.phoneNumber="111-1111-1111";
		a.address="埼玉";
		a.mail="bbb@bbbb";
		a. seibetu="男";
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.phoneNumber);
		System.out.println(a.address);
		System.out.println(a.mail);
		System.out.println(a.seibetu);

		Person b=new Person();
		b.name ="鈴木花子";
		b.age=16;
		b.phoneNumber="222-2222-2222";
		b.address="神奈川";
		b.mail="ccc@cccc";
		b.seibetu="女";
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.phoneNumber);
		System.out.println(b.address);
		System.out.println(b.mail);
		System.out.println(b.seibetu);


		taro.talk();
		taro.walk();
		taro.run();

		Robot aibo =new Robot();
		aibo.name = "aibo";
		System.out.println(aibo.name);

		Robot asimo=new Robot ();
		asimo.name="asimo";
		System.out.println(asimo.name);

		Robot pepper=new Robot ();
		pepper.name="pepper";
		System.out.println(pepper.name);

		Robot doraemon=new Robot();
		doraemon.name ="doraemon";
		System.out.println(doraemon.name);

		aibo.talk();
		asimo.run();
		pepper.walk();



	}
}