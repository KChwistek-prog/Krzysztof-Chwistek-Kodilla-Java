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

        if (name.equals(type)) {
            System.out.println("Companies found: ");
            searchService.searchCompany(name)
                    .forEach(e -> System.out.println(e.getName()));
        } else if (type.equals("employee")) {
            System.out.println("Employees found: ");
            searchService.searchEmployee(name)
                    .forEach(e -> System.out.println(e.getFirstname() + " " + e.getLastname()));
        }
    }
}
