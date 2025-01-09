package com.ecld.java.assess4c;

import java.util.*;
import java.util.stream.Collectors;

public class LogAnalysis {

	public static Map<String, UserActivityStats> analyzeUserActivity(List<LogEntry> logs) {
		return logs.stream()
				.collect(Collectors.groupingBy(LogEntry::getUserId)) // Group by userId
				.entrySet().stream()
				.filter(entry -> entry.getValue().size() >= 5) //At least 5 log entries filtered
				.map(entry -> {
					List<LogEntry> userLogs = entry.getValue();
					long totalEntries = userLogs.size();
					long successCount = userLogs.stream()
							.filter(log -> "SUCCESS".equals(log.getStatus()))
							.count();
					double successRate = (double) successCount / totalEntries * 100;
					double avgProcessingTime = userLogs.stream()
							.filter(log -> "SUCCESS".equals(log.getStatus()))
							.mapToLong(LogEntry::getProcessingTimeMs)
							.average()
							.orElse(0);

					Set<String> distinctActions = userLogs.stream()
							.map(LogEntry::getAction)
							.collect(Collectors.toSet());
					return new AbstractMap.SimpleEntry<>(entry.getKey(), new UserActivityStats(successRate, avgProcessingTime, distinctActions));
				})
				.sorted(Comparator.comparingDouble(entry -> entry.getValue().getAvgProcessingTime())) // Sort by average processing time
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1,
						LinkedHashMap::new
				));
	}
}
