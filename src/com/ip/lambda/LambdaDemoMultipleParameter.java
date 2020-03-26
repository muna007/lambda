package com.ip.lambda;

@FunctionalInterface
interface Sports{
	public String games(String name1, String name2);
}

public class LambdaDemoMultipleParameter {

	public static void main(String[] args) {
		Sports gamenames = (name1, name2) -> {
			return name1+name2;
		};
		System.out.println(gamenames.games("Cricket ", "Football"));
	}

}
