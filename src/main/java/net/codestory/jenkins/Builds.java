package net.codestory.jenkins;

import lombok.*;

import java.util.*;

@Data
public class Builds {
	public final List<Build> builds;

	public List<Build> getBuild() {
		return builds;
	}
}
