package com.execel.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * It creates table structure to store values in an object
 * 
 * @author Kalaivanan 
 *
 */

@Entity
@Table(name = "business_partner")
public class BusinessPartner {

	@Column(name = "business_partner_id")
	private int business_partner_id;

	@Column(name = "business_partner_name")
	private String business_partner_name;

	@Column(name = "business_partner_code")
	private String business_partner_code;

	@Column(name = "contact_name")
	private String contact_name;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "city")
	private String city;

	@Column(name = "province")
	private String province;

	@Column(name = "country")
	private String country;

	@Column(name = "postal_code")
	private String postal_code;

	@Column(name = "parent_company")
	private String parent_company;

	@Column(name = "toll_free_number")
	private String toll_free_number;

	@Column(name = "phone")
	private String phone;

	@Column(name = "phone_extension")
	private String phone_extension;

	@Column(name = "fax")
	private String fax;

	@Column(name = "website_url")
	private String website_url;

	@Column(name = "payment_condition")
	private int payment_condition;

	@Column(name = "gl_number")
	private String gl_number;

	@Column(name = "driver_min_age")
	private int driver_min_age;

	@Column(name = "api_enabled")
	private int api_enabled;

	@Column(name = "status")
	private int status;

	@Column(name = "one_way_fee_paid_by")
	private String one_way_fee_paid_by;

	@Column(name = "country_code")
	private String country_code;

	public BusinessPartner() {
	}

	/**
	 * store business_partner_id value
	 * 
	 * @param business_partner_id
	 */
	public void setBusinessPartnerId(int business_partner_id) {
		this.business_partner_id = business_partner_id;
	}

	/**
	 * return business_partner_id
	 * 
	 * @return
	 */
	public int getBusinessPartnerId() {
		return business_partner_id;
	}

	/**
	 * store business_partner_name value
	 * 
	 * @param business_partner_name
	 */
	public void setBusinessPartnerName(String business_partner_name) {
		this.business_partner_name = business_partner_name;
	}

	/**
	 * return business_partner_name
	 * 
	 * @return
	 */
	public String getBusinessPartnerName() {
		return business_partner_name;
	}

	/**
	 * store business_partner_code value
	 * 
	 * @param business_partner_code
	 */
	public void setBusinessPartnerCode(String business_partner_code) {
		this.business_partner_code = business_partner_code;
	}

	/**
	 * return business_partner_code
	 * 
	 * @return
	 */
	public String getBusinessPartnerCode() {
		return business_partner_code;
	}

	/**
	 * store contact_name value
	 * 
	 * @param contact_name
	 */
	public void setContactNumber(String contact_name) {
		this.contact_name = contact_name;
	}

	/**
	 * return contact_name
	 * 
	 * @return
	 */
	public String getContactNumber() {
		return contact_name;
	}

	/**
	 * store address1 value
	 * 
	 * @param address1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * return address1
	 * 
	 * @return
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * store address2 value
	 * 
	 * @param address2
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * return address2
	 * 
	 * @return
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * store city value
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * return city
	 * 
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * store province value
	 * 
	 * @param province
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * return province
	 * 
	 * @return
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * store country value
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * return country
	 * 
	 * @return
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * store postal_code value
	 * 
	 * @param postal_code
	 */
	public void setPostalCode(String postal_code) {
		this.postal_code = postal_code;
	}

	/**
	 * return postal_code
	 * 
	 * @return
	 */
	public String getPostalCode() {
		return postal_code;
	}

	/**
	 * store parent_company value
	 * 
	 * @param parent_company
	 */
	public void setParentCompany(String parent_company) {
		this.parent_company = parent_company;
	}

	/**
	 * return parent_company
	 * 
	 * @return
	 */
	public String getParentCompany() {
		return parent_company;
	}

	/**
	 * store toll_free_number value
	 * 
	 * @param toll_free_number
	 */
	public void setTollFreeNumber(String toll_free_number) {
		this.toll_free_number = toll_free_number;
	}

	/**
	 * return toll_free_number
	 * 
	 * @return
	 */
	public String getTollFreeNumber() {
		return toll_free_number;
	}

	/**
	 * store phone value
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * return phone
	 * 
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * store phone_extension value
	 * 
	 * @param phone_extension
	 */
	public void setPhoneExtension(String phone_extension) {
		this.phone_extension = phone_extension;
	}

	/**
	 * return phone_extension
	 * 
	 * @return
	 */
	public String getPhoneExtension() {
		return phone_extension;
	}

	/**
	 * store fax value
	 * 
	 * @param fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * return fax
	 * 
	 * @return
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * store website_url value
	 * 
	 * @param website_url
	 */
	public void setWebsiteUrl(String website_url) {
		this.website_url = website_url;
	}

	/**
	 * return website_url
	 * 
	 * @return
	 */
	public String getWebsiteUrl() {
		return website_url;
	}

	/**
	 * store payment_condition value
	 * 
	 * @param payment_condition
	 */
	public void setPaymentCondition(int payment_condition) {
		this.payment_condition = payment_condition;
	}

	/**
	 * return payment_condition
	 * 
	 * @return
	 */
	public int getPaymentCondition() {
		return payment_condition;
	}

	/**
	 * store gl_number value
	 * 
	 * @param gl_number
	 */
	public void setGlNumber(String gl_number) {
		this.gl_number = gl_number;
	}

	/**
	 * return gl_number
	 * 
	 * @return
	 */
	public String getGlNumber() {
		return gl_number;
	}

	/**
	 * store driver_min_age value
	 * 
	 * @param driver_min_age
	 */
	public void setDriverMinAge(int driver_min_age) {
		this.driver_min_age = driver_min_age;
	}

	/**
	 * return driver_min_age
	 * 
	 * @return
	 */
	public int setDriverMinAge() {
		return driver_min_age;
	}

	/**
	 * store api_enabled value
	 * 
	 * @param api_enabled
	 */
	public void setApiEnabled(int api_enabled) {
		this.api_enabled = api_enabled;
	}

	/**
	 * return api_enabled
	 * 
	 * @return
	 */
	public int getApiEnabled() {
		return api_enabled;
	}

	/**
	 * store status value
	 * 
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * return status
	 * 
	 * @return
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * store one_way_fee_paid_by value
	 * 
	 * @param one_way_fee_paid_by
	 */
	public void setOneWayFeePaidBy(String one_way_fee_paid_by) {
		this.one_way_fee_paid_by = one_way_fee_paid_by;
	}

	/**
	 * return one_way_fee_paid_by
	 * 
	 * @return
	 */
	public String getOneWayFeePaidBy() {
		return one_way_fee_paid_by;
	}

	/**
	 * store country_code value
	 * 
	 * @param country_code
	 */
	public void setCountryCode(String country_code) {
		this.country_code = country_code;
	}

	/**
	 * return country_code
	 * 
	 * @return
	 */
	public String getCountryCode() {
		return country_code;
	}
}
