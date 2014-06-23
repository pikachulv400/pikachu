package com.kickstarter.display;

import org.lwjgl.util.vector.Vector2f;

public class ArenaCamera {
	private static ArenaCamera instance;

	private Vector2f cameraPosition = new Vector2f(0, 0);

	public static ArenaCamera getInstance() {
		if (instance == null) {
			instance = new ArenaCamera();
		}
		return instance;
	}

	public void update() {

	}

	public static void main(String args[]) {

	}

}
