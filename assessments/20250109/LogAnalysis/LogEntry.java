package com.ecld.java.assess4c;

import java.time.LocalDateTime;

public class LogEntry {
	private String userId;
	private LocalDateTime timestamp;
	private String action;
	private String status; // "SUCCESS" or "FAILURE"
	private long processingTimeMs;

	// Constructors,getters and setters
	public LogEntry(String userId, LocalDateTime timestamp, String action, String status, long processingTimeMs) {
		this.userId = userId;
		this.timestamp = timestamp;
		this.action = action;
		this.status = status;
		this.processingTimeMs = processingTimeMs;
	}

	public String getUserId() {
		return userId;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getAction() {
		return action;
	}

	public String getStatus() {
		return status;
	}

	public long getProcessingTimeMs() {
		return processingTimeMs;
	}
}
