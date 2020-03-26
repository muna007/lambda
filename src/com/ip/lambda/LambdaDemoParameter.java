package com.ip.lambda;

@FunctionalInterface
interface Cricket {
	public String play(String name);
}

public class LambdaDemoParameter {

	public static void main(String[] args) {
		Cricket football = (name) -> {
			return name + " playing";
		};
		System.out.println(football.play("virat"));

	}
}
