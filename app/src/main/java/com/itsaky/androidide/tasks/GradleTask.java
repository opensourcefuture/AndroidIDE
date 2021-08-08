package com.itsaky.androidide.tasks;

import java.io.File;

public interface GradleTask {
    
	public String getName();
    public String getCommands();
	public int getTaskID();
	public boolean shouldSaveFiles();
	public boolean canOutput();
	public boolean buildsApk();
	public File getApk(String buildFolder, String moduleName);
	public Type getType();
	
	public static enum Type {
		ANDROIDIDE_PLUGIN,
		BUILD,
		LINT,
		HELP,
		OTHER
		}
    
}