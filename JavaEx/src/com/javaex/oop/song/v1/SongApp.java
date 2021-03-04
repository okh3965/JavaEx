package com.javaex.oop.song.v1;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		Song s2 = new Song("BIGBANG", "거짓말", "Always", 2007, 2, "G-DRAGON");
		Song s3 = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, 4, "장범준");
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}

}
