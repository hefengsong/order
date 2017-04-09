/**
 * 
 */
package com.qterp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Think
 *
 */
@Entity // This tells Hibernate to make a table out of this class
public class Order {
	 private String client_ip;	
	 
	 private String customer_address;
	 private String customer_name;
	 private String customer_postcode;
	 private String customer_tel;
	 private String datetime;
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer id;
	 private String keywords;
	 private String operate;
	 private String order_id;
	 private String product;	 
	 private String sale_channel;	 
	 private String sale_name;
	 private String status;
	 
	 
	 
	 
	 public String getClient_ip() {
		return client_ip;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public String getCustomer_postcode() {
		return customer_postcode;
	}

	public String getCustomer_tel() {
		return customer_tel;
	}

	public String getDatetime() {
		return datetime;
	}

	public Integer getId() {
			return id;
		}

	public String getKeywords() {
		return keywords;
	}

	public String getOperate() {
		return operate;
	}

	public String getOrder_id() {
		return order_id;
	}

	public String getProduct() {
		return product;
	}

	public String getSale_channel() {
		return sale_channel;
	}

	public String getSale_name() {
		return sale_name;
	}

	public String getStatus() {
		return status;
	}

	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public void setCustomer_postcode(String customer_postcode) {
		this.customer_postcode = customer_postcode;
	}

	public void setCustomer_tel(String customer_tel) {
		this.customer_tel = customer_tel;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public void setOperate(String operate) {
		this.operate = operate;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setSale_channel(String sale_channel) {
		this.sale_channel = sale_channel;
	}

	public void setSale_name(String sale_name) {
		this.sale_name = sale_name;
	}

		public void setStatus(String status) {
			this.status = status;
		}
	 

}
