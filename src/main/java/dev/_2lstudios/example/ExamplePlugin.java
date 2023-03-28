package dev._2lstudios.example;

import net.md_5.bungee.api.plugin.Plugin;

public class ExamplePlugin extends Plugin {

    @Override
    public void onEnable() {
        // Set static instance
        ExamplePlugin.instance = this;
    }

    private static ExamplePlugin instance;

    public static ExamplePlugin getInstance() {
        return ExamplePlugin.instance;
    }
}