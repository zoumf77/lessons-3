package com.zoumf77.inheritdemo.interfacemethods;

public interface Mythical {
	 default public String identifyMyself() {
	        return "I am a mythical creature.";
	    }
}
