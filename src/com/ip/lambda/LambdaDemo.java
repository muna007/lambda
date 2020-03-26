package com.ip.lambda;

@FunctionalInterface
interface Game {
	void play();
}

public class LambdaDemo {

	public static void main(String[] args) {
		Game football = () -> {
			System.out.println("playing football....");
		};
		football.play();

	}

}
