package com.zoumf77.inheritdemo.interfacemethods;

public interface Flyer {
	default public String identifyMyself() {
        return "I am able to fly.";
    }
}
