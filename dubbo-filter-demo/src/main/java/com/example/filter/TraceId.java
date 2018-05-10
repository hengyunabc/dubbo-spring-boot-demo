package com.example.filter;

import java.util.UUID;

public class TraceId {
	private static final ThreadLocal<String> traceId = new ThreadLocal<String>();

	public static String get() {
		String id = traceId.get();
		if (id == null) {
			id = UUID.randomUUID().toString();
			traceId.set(id);
		}
		return id;
	}

}