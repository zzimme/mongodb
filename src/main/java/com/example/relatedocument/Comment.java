package com.example.relatedocument;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.BaseModel;

@Document
public class Comment extends BaseModel{

	@Id
	private ObjectId id;
	
	private String comment;
	private int refer;
	
	@DBRef
	private Emoticon emoticon;
	
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRefer() {
		return refer;
	}
	public void setRefer(int refer) {
		this.refer = refer;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public Emoticon getEmoticon() {
		return emoticon;
	}
	public void setEmoticon(Emoticon emoticon) {
		this.emoticon = emoticon;
	}
	
}
