package com.ecld.java.assess4c;

import java.util.Set;

public class UserActivityStats {
	private double successRate;
	private double avgProcessingTime;
	private Set<String> distinctActions;

	// Constructors,getters and setters

	public UserActivityStats(double successRate, double avgProcessingTime, Set<String> distinctActions) {
		this.successRate = successRate;
		this.avgProcessingTime = avgProcessingTime;
		this.distinctActions = distinctActions;
	}

	public double getSuccessRate() {
		return successRate;
	}

	public double getAvgProcessingTime() {
		return avgProcessingTime;
	}

	public Set<String> getDistinctActions() {
		return distinctActions;
	}

	@Override
	public String toString() {
		String formattedSuccessRate = String.format("%.2f", successRate);
		String formattedAvgProcessingTime = String.format("%.2f", avgProcessingTime);

		return "User ActivityStats{" +
				"successRate=" + formattedSuccessRate +
				", avgProcessingTime=" + formattedAvgProcessingTime +
				", distinctActions=" + distinctActions +
				'}';
	}
}
