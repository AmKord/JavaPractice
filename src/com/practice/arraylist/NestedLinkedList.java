package com.practice.arraylist;

import java.util.ArrayList;
import java.util.List;

public class NestedLinkedList {
	
	public static void main(String[] args) {
		
		Users u1 = new Users();
		u1.setUserId("u1");
		Users u2 = new Users();
		u2.setUserId("u2");
		Users u3 = new Users();
		u3.setUserId("u3");
		Users u4 = new Users();
		u4.setUserId("u4");
		
		
		List<Users> users = new ArrayList<>();
		List<Group> groups = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		
		
		System.out.println(users);
		
		Group g1 = new Group();
		g1.setGroupId(1);
		g1.setUsers(users);
		groups.add(g1);
		
		Group g2 = new Group();
		g2.setGroupId(2);
		g2.setUsers(users);
		g2.setGroups(groups);
				
		System.out.println(g2);
		
		for(Group i:groups) {
			System.out.println("---"+i.getUsers());
		}
		
	}

}
