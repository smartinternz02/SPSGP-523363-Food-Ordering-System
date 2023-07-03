package com.externshipproject.FoodOrderingSystemTeam110.other;
public class ErrorResponse {
    private String message;
    private String details;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public ErrorResponse(String message, String details) {
		super();
		this.message = message;
		this.details = details;
	}
	public ErrorResponse() {
		super();
	}
}
