
package ui;

import java.util.Scanner;

import service.LibraryService;
import service.SearchService;

import algorithms.M1_StringAlgorithms;
import algorithms.M2_SuffixStructures;
import algorithms.M3_DynamicProgramming;
import algorithms.M4_NetworkFlow;
import algorithms.M5_NPCompleteness;
import algorithms.M6_RandomizedParallel;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryService library = new LibraryService();
        SearchService search = new SearchService(library);

        int choice = -1;

        do {
            System.out.println("\n==================================");
            System.out.println("          SMART LIBRARY");
            System.out.println(" Intelligent Digital Library Platform");
            System.out.println("==================================");
            System.out.println("1. Search Books");
            System.out.println("2. View Research Papers");
            System.out.println("3. M1 - String Algorithms");
            System.out.println("4. M2 - Suffix Structures");
            System.out.println("5. M3 - Dynamic Programming");
            System.out.println("6. M4 - Network Flow");
            System.out.println("7. M5 - NP-Completeness");
            System.out.println("8. M6 - Randomized and Parallel Algorithms");
            System.out.println("9. Exit");
            System.out.println("==================================");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book keyword: ");
                    search.displayBookResults(sc.nextLine());
                    break;

                case 2:
                    library.displayResearchPapers();
                    break;

                case 3:
                    M1_StringAlgorithms.main(new String[0]);
                    break;

                case 4:
                    M2_SuffixStructures.main(new String[0]);
                    break;

                case 5:
                    M3_DynamicProgramming.main(new String[0]);
                    break;

                case 6:
                    M4_NetworkFlow.main(new String[0]);
                    break;

                case 7:
                    M5_NPCompleteness.main(new String[0]);
                    break;

                case 8:
                    M6_RandomizedParallel.main(new String[0]);
                    break;

                case 9:
                    System.out.println("Thank you for using SmartLibrary!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 9);

        sc.close();
    }
}
