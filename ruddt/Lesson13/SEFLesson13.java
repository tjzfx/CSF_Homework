package com.generalassembly;

import java.util.ArrayList;
import java.util.List;

public class SEFLesson13 {

		public static void main(String[] args) {
			// Create 100 threads counting to one billion.
			List<Thread> threads = new ArrayList<Thread>();
			for (int i = 0; i < 100; i++) {
				Runnable task = new CountToOneMillion();
				Thread worker = new Thread(task);
				worker.start();
			}

			// Loop until no threads are left running.
			int running = 0;
			do {
				running = 0;
				for (Thread thread : threads) {
					if (thread.isAlive()) {
						running++;
					}
				}
			} while (running > 0);

		}

}
