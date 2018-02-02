package com.Chintan.SpringBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	@Column
	private String emp_name;
	@Column
	private String role_capability;
	@Column
	private String dm_name;
	@Column
	private String onsite_offshore;
	@Column
	private String reporting_manager;
	@Column
	private int job_band;
	@Column
	private int crr;
	@Column
	private String visa_status;
	@Column
	private String ai_owner;
	@Column
	private String esep_init;
	@Column
	private String comments;
	@Column
	private String last_leave_data;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getRole_capablility() {
		return role_capability;
	}
	public void setRole_capablility(String role_capablility) {
		this.role_capability = role_capablility;
	}
	public String getDm_name() {
		return dm_name;
	}
	public void setDm_name(String dm_name) {
		this.dm_name = dm_name;
	}
	public String getOnsite_offshore() {
		return onsite_offshore;
	}
	public void setOnsite_offshore(String onsite_offshore) {
		this.onsite_offshore = onsite_offshore;
	}
	public String getReporting_manager() {
		return reporting_manager;
	}
	public void setReporting_manager(String reporting_manager) {
		this.reporting_manager = reporting_manager;
	}
	public int getJob_band() {
		return job_band;
	}
	public void setJob_band(int job_band) {
		this.job_band = job_band;
	}
	public int getCrr() {
		return crr;
	}
	public void setCrr(int crr) {
		this.crr = crr;
	}
	public String getVisa_status() {
		return visa_status;
	}
	public void setVisa_status(String visa_status) {
		this.visa_status = visa_status;
	}
	public String getAi_owner() {
		return ai_owner;
	}
	public void setAi_owner(String ai_owner) {
		this.ai_owner = ai_owner;
	}
	public String getEsep_init() {
		return esep_init;
	}
	public void setEsep_init(String esep_init) {
		this.esep_init = esep_init;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getLast_leave_data() {
		return last_leave_data;
	}
	public void setLast_leave_data(String last_leave_data) {
		this.last_leave_data = last_leave_data;
	}
	
	
}
