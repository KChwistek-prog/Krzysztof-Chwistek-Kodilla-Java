package com.kodilla.hibernate.manytomany.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchFacade {
    private final SearchService searchService;

    @Autowired
    public SearchFacade(SearchService searchService) {
        this.searchService = searchService;
    }

    public void search(String type, String name) {

        if (type.equals("company")) {
            System.out.println("Companies found: ");
            searchService.SearchCompany(name)
                    .forEach(e -> System.out.println(e.getName()));
        } else if (type.equals("employee")) {
            System.out.println("Employees found: ");
            searchService.SearchEmployee(name)
                    .forEach(e -> System.out.println(e.getFirstname() + " " + e.getLastname()));
        }
    }
}
