
package service;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.ResearchPaper;

public class SearchService {

    private LibraryService library;

    public SearchService(LibraryService library) {
        this.library = library;
    }

    // Search books
    public List<Book> searchBooks(String keyword) {

        List<Book> results = new ArrayList<>();

        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }

        String searchText = keyword.trim().toLowerCase();

        for (Book book : library.getBooks()) {

            String text = (
                    book.getTitle() + " "
                    + book.getAuthor() + " "
                    + book.getKeyword()
            ).toLowerCase();

            if (text.contains(searchText)) {
                results.add(book);
            }
        }

        return results;
    }

    // Search research papers
    public List<ResearchPaper> searchPapers(String keyword) {

        List<ResearchPaper> results = new ArrayList<>();

        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }

        String searchText = keyword.trim().toLowerCase();

        for (ResearchPaper paper : library.getPapers()) {

            String text = (
                    paper.getTitle() + " "
                    + paper.getAuthor() + " "
                    + paper.getAbstractText()
            ).toLowerCase();

            if (text.contains(searchText)) {
                results.add(paper);
            }
        }

        return results;
    }

    // Display book search results
    public void displayBookResults(String keyword) {

        List<Book> results = searchBooks(keyword);

        System.out.println("\n========== BOOK SEARCH RESULTS ==========");

        if (results.isEmpty()) {
            System.out.println("No matching books found.");
            return;
        }

        for (Book book : results) {
            System.out.println(book);
            System.out.println("-----------------------------------------");
        }

        System.out.println("Total books found: " + results.size());
    }

    // Display research paper search results
    public void displayPaperResults(String keyword) {

        List<ResearchPaper> results = searchPapers(keyword);

        System.out.println("\n====== PAPER SEARCH RESULTS ======");

        if (results.isEmpty()) {
            System.out.println("No matching papers found.");
            return;
        }

        for (ResearchPaper paper : results) {

            System.out.println("Paper ID         : " + paper.getPaperId());
            System.out.println("Title            : " + paper.getTitle());
            System.out.println("Author           : " + paper.getAuthor());
            System.out.println("Abstract         : " + paper.getAbstractText());
            System.out.println("Publication Year : " + paper.getPublicationYear());

            System.out.println("----------------------------------");
        }

        System.out.println("Total papers found: " + results.size());
    }
}
