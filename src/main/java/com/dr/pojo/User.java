package com.dr.pojo;

import java.sql.Date;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails{
	private Integer id;
	private String account;
	private String password;
//	private String name;
//	private String job;
//	private String rights;
//	private String roleId;
//	private String deptId;
//	private String deptName;
//	private Integer createUserId;
//	private Date createTime;
//	private Integer updateUserId;
//	private Date updateTime;
	private int del;
	private int enable;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getJob() {
//		return job;
//	}
//
//	public void setJob(String job) {
//		this.job = job;
//	}
//
//	public String getRights() {
//		return rights;
//	}
//
//	public void setRights(String rights) {
//		this.rights = rights;
//	}
//
//	public String getRoleId() {
//		return roleId;
//	}
//
//	public void setRoleId(String roleId) {
//		this.roleId = roleId;
//	}
//
//	public String getDeptId() {
//		return deptId;
//	}
//
//	public void setDeptId(String deptId) {
//		this.deptId = deptId;
//	}
//
//	public String getDeptName() {
//		return deptName;
//	}
//
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
//
//	public Integer getCreateUserId() {
//		return createUserId;
//	}
//
//	public void setCreateUserId(Integer createUserId) {
//		this.createUserId = createUserId;
//	}
//
//	public Date getCreateTime() {
//		return createTime;
//	}
//
//	public void setCreateTime(Date createTime) {
//		this.createTime = createTime;
//	}
//
//	public Integer getUpdateUserId() {
//		return updateUserId;
//	}
//
//	public void setUpdateUserId(Integer updateUserId) {
//		this.updateUserId = updateUserId;
//	}
//
//	public Date getUpdateTime() {
//		return updateTime;
//	}
//
//	public void setUpdateTime(Date updateTime) {
//		this.updateTime = updateTime;
//	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return AuthorityUtils.commaSeparatedStringToAuthorityList("admin");
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return getAccount();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return getDel() == 0;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return getEnable() == 1;
	}
}