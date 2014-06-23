package com.kickstarter.util;

import java.util.HashMap;

import org.lwjgl.test.opengl.sprites.SpriteShootoutMapped.Sprite;

public class Animation {
	private final HashMap<Integer, Sprite> animationFrames;
	public static final byte FramePerSecond = 24;

	public Animation(HashMap<Integer, Sprite> animationFrames) {
		this.animationFrames = animationFrames;
	}

	public Sprite getFrame(int frame) {
		return animationFrames.get(frame);
	}
	
	public void play(int fromFrame,int toFrame){
		//TODO
	}

}
