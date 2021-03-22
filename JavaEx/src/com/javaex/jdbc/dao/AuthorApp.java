package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AuthorApp {

	public static void main(String[] args) {
		listAuthors();
//		insertAuthor();
//		deleteAuthor();
//		updateAuthor();
//		listAuthors();
		
		searchAuthors();
	}

	private static void listAuthors() {
		AuthorDao dao = new AuthorDaoOracleImpl();
		List<AuthorVo> list = dao.getList();
		// Iterator(반복자) 추출
		Iterator<AuthorVo> it = list.iterator();
		
		while(it.hasNext()) {	//내용이 더 있으면
			AuthorVo vo = it.next();
			System.out.printf("%d, %s, %s%n", vo.getId(), vo.getName(), vo.getBio());
		}
	}
	
	private static void insertAuthor() {
		// Scanner로 이름, bio 정보를 입력받아 -> DAO에서 INSERT
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("경력:");
		String bio = sc.next();
		
		AuthorVo vo = new AuthorVo(name, bio);
		
		AuthorDao dao = new AuthorDaoOracleImpl();
		boolean success = dao.insert(vo);
		
		System.out.println("Author INSERT:" + (success ? "성공" : "실패"));
		sc.close();
		
	}
	
	private static void deleteAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 작가:");
		long authorId = sc.nextLong();
		
		AuthorDao dao = new AuthorDaoOracleImpl();
		boolean success = dao.delete(authorId);
		
		System.out.println("Author DELETE:" + (success ? "성공" : "실패"));
		sc.close();
		
	}
	
	private static void updateAuthor() {
		// 작가 PK 확인
		// 업데이트 내용 : name, bio
		Scanner sc = new Scanner(System.in);
		System.out.print("업데이트할 작가:");
		long authorId = sc.nextLong();
		System.out.print("변경할 이름:");
		String name = sc.next();
		System.out.print("변경할 이력:");
		String bio = sc.next();
		
		AuthorVo vo = new AuthorVo(authorId, name, bio);
		AuthorDao dao = new AuthorDaoOracleImpl();
		
		boolean success = dao.update(vo);
		
		System.out.println("Author UPDATE:" + (success ? "성공" : "실패"));
		sc.close();
		
	}
	
	private static void searchAuthors() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어:");
		String keyword = sc.next();
		
		AuthorDao dao = new AuthorDaoOracleImpl();
		List<AuthorVo> list = dao.search(keyword);
		
		Iterator<AuthorVo> it = list.iterator();
		
		while(it.hasNext()) {
			AuthorVo vo = it.next();
			System.out.println(vo);			
		}
		sc.close();
	}
}
