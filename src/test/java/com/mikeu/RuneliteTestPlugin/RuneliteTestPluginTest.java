package com.mikeu.RuneliteTestPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RuneliteTestPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(RuneliteTestPluginPlugin.class);
		RuneLite.main(args);
	}
}