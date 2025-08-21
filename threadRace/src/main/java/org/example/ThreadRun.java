package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadRun {
        public static void main(String[] args) throws InterruptedException {
            List<Integer> l1 = new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                l1.add(i);
            }
            List<Integer> eN = Collections.synchronizedList(new ArrayList<>());
            List<Integer> oN = Collections.synchronizedList(new ArrayList<>());
            List<List<Integer>> partitions = new ArrayList<>();
            int partitionSize = 250;
            for (int i = 0; i < l1.size(); i += partitionSize) {
                partitions.add(l1.subList(i, i + partitionSize));
            }

            class ThreadClass extends Thread {
                private List<Integer> sublist;

                public ThreadClass(List<Integer> sublist) {
                    this.sublist = sublist;
                }
                @Override
                public void run() {
                    for (Integer num : sublist) {
                        if (num % 2 == 0) {
                            eN.add(num);
                        } else {
                            oN.add(num);
                        }
                    }
                }
            }
            List<Thread> threads = new ArrayList<>();
            for (List<Integer> part : partitions) {
                Thread t = new ThreadClass(part);
                threads.add(t);
                t.start();
            }
            for (Thread t : threads) {
                t.join();
            }
            System.out.println("Çift sayı adedi: " + eN.size());
            System.out.println("Tek sayı adedi: " + oN.size());
        }
}