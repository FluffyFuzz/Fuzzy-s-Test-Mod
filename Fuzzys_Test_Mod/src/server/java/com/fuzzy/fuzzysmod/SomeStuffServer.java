package com.fuzzy.fuzzysmod;

import com.fox2code.foxloader.loader.ServerMod;

public class SomeStuffServer extends SomeStuff implements ServerMod {
    public void onInit() {
        System.out.println("Fuzzy's mod server initializing");
    }
}
