package com.test.SpringBottwithHibernate.Entity;
// Generated May 26, 2020 3:23:43 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Country generated by hbm2java
 */
@Entity
@Table(name = "country", catalog = "employee_master")
public class Country implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cid;
	private String cname;
	//private Set employeeTables = new HashSet(0);

	public Country() {
	}

	public Country(String cname) {
		this.cname = cname;
	}
/*
	public Country(String cname, Set employeeTables) {
		this.cname = cname;
		this.employeeTables = employeeTables;
	}
*/
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "cid", unique = true, nullable = false)
	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	@Column(name = "cname", nullable = false, length = 45)
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set getEmployeeTables() {
		return this.employeeTables;
	}

	public void setEmployeeTables(Set employeeTables) {
		this.employeeTables = employeeTables;
	}
*/
}
