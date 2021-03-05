package com.javaex.oop.summary;

public class SummarryApp {
	// 쿵후 도장
	static KungfuSkill[] dojang;
	
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 30);
		Human h2 = new TheOne("네오", 50);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("퐁", 15);
	
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		// 도장에 등록
		dojang = new KungfuSkill[] {
				//((KungfuSkill)h1),	//casting x
				((KungfuSkill)h2),
				//((KungfuSkill)p1),	//casting x
				((KungfuSkill)p2)
		};
		
		// loop
		for (KungfuSkill member: dojang) {
			member.kungfu();
		}
	}
	
	public static void fight(Animal actor) {
		// actor가 kungfu를 할 수 있나?
		if(actor instanceof KungfuSkill) {
			// 다운캐스팅 가능
			((KungfuSkill)actor).kungfu();
		}else {
			System.out.println(actor.name + ": 쿵후 못해요");
		}
	}
	
	public static void fly(Animal actor) {
		if(actor instanceof Flyable) {
			((Flyable)actor).fly();
		}else {
			System.out.println(actor.name + ": I can't fly");
		}
	}

}
