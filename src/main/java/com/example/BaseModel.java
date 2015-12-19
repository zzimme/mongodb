package com.example;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


public class BaseModel  {

		
	@Override
	public String toString() {

		return ToStringBuilder.reflectionToString( this, ToStringStyle.MULTI_LINE_STYLE );
	}
	
}
