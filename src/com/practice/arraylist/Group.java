package com.practice.arraylist;

import java.util.List;

public class Group {

	int groupId;

	List<Users> users;
	List<Group> groups;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "groupId=" + groupId + ", users=" + users + ", groups=" + groups + "]";
	}

	
	
}
