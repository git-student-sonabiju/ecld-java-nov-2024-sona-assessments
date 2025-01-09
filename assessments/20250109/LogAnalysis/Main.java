package com.ecld.java.assess4c;

import static com.ecld.java.assess4c.LogAnalysis.analyzeUserActivity;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		List<LogEntry> logs = Arrays.asList(
				new LogEntry("user1", LocalDateTime.now(), "LOGIN", "SUCCESS", 100),
				new LogEntry("user1", LocalDateTime.now(), "UPLOAD", "SUCCESS", 150),
				new LogEntry("user1", LocalDateTime.now(), "DOWNLOAD", "FAILURE", 200),
				new LogEntry("user2", LocalDateTime.now(), "LOGIN", "SUCCESS", 90),
				new LogEntry("user2", LocalDateTime.now(), "UPLOAD", "SUCCESS", 130),
				new LogEntry("user2", LocalDateTime.now(), "DOWNLOAD", "FAILURE", 110),
				new LogEntry("user1", LocalDateTime.now(), "LOGIN", "SUCCESS", 80),
				new LogEntry("user2", LocalDateTime.now(), "UPLOAD", "FAILURE", 200),
				new LogEntry("user1", LocalDateTime.now(), "DOWNLOAD", "SUCCESS", 150),
				new LogEntry("user2", LocalDateTime.now(), "LOGIN", "FAILURE", 210)
		);
		Map<String, UserActivityStats> userActivityStats = analyzeUserActivity(logs);
		userActivityStats.forEach((userId, stats) -> {
			System.out.println("User ID: " + userId);
			System.out.println("Status: " + stats);
		});
	}
}
