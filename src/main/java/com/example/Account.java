package com.example;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Account extends BaseModel{

  @Id
  private ObjectId id;
  private int total;
  
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

}
