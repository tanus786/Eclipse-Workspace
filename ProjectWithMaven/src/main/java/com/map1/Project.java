package com.map1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;

	@Column(name = "Project_name")
	private String projectname;
	
	@ManyToMany
	private List<Emp> emps;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String projectname, List<Emp> emps) {
		super();
		this.pid = pid;
		this.projectname = projectname;
		this.emps = emps;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

}


//<mapping class="com.tut.Student" />
//<mapping class="com.tut.Address" />
//<mapping class="com.map.Question" />
//<mapping class="com.map.Answer" />
//<mapping class="com.map1.Project" />
//<mapping class="com.map1.Emp" />
//<mapping class="com.map2.Question1" />
//<mapping class="com.map2.Answer1" />
