package com.sasha17todd.homework;

public class TestConfigRunner {

    public static void main(String[] args) {
        BrowserConfig configComplet = new BrowserConfig(
                BrowserType.FIREFOX,
                "120.0",
                false
        );

        BrowserConfig configCuVersion = new BrowserConfig(
                BrowserType.EDGE,
                "118.2"
        );

        BrowserConfig configDoarBrowser = new BrowserConfig(
                BrowserType.CHROME
        );

        BrowserConfig configDefaultChrome = BrowserConfig.createDefaultChromeConfig();

        System.out.println("Configuratie COMPLETA:");
        configComplet.afiseazaConfig();

        System.out.println("Configuratie cu browser + version:");
        configCuVersion.afiseazaConfig();

        System.out.println("Configuratie cu doar browser:");
        configDoarBrowser.afiseazaConfig();

        System.out.println("Configuratie default Chrome (factory):");
        configDefaultChrome.afiseazaConfig();
    }
}
