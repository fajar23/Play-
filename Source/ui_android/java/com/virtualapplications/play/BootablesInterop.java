package com.virtualapplications.play;

public class BootablesInterop
{
	static
	{
		System.loadLibrary("Play");
	}

	public static native void scanBootables(String[] rootDirectories);
	public static native Bootable[] getBootables();
	public static native void setLastBootedTime(String bootablePath, long lastBootedTime);
}
