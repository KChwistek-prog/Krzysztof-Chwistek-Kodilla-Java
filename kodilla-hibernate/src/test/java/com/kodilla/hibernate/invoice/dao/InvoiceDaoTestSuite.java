//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import java.math.BigDecimal;
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//
//    @Autowired
//    private InvoiceDao invoiceDao;
//
//    @Test
//    void testInvoiceDaoSave() {
//
//        //given
//        Product product1 = new Product("Product1");
//        Product product2 = new Product("Product2");
//        Product product3 = new Product("Product3");
//
//        Item item1 = new Item(product1, BigDecimal.valueOf(200), 5, BigDecimal.valueOf(2000));
//        Item item2 = new Item(product2, BigDecimal.valueOf(300), 4, BigDecimal.valueOf(1200));
//        Item item3 = new Item(product3, BigDecimal.valueOf(400), 3, BigDecimal.valueOf(1200));
//
//        Invoice invoice1 = new Invoice("1", Arrays.asList(item1));
//        Invoice invoice2 = new Invoice("2", Arrays.asList(item2, item3));
//
//
//        //when
//        invoiceDao.save(invoice1);
//        int invoice1Id = invoice1.getId();
//        invoiceDao.save(invoice2);
//        int invoice2Id = invoice2.getId();
//
//        //then
//        assertNotEquals(0, invoice1Id);
//        assertNotEquals(0, invoice2Id);
//
//        //cleanUp
//        try {
//            invoiceDao.deleteById(invoice1Id);
//            invoiceDao.deleteById(invoice2Id);
//        } catch (Exception e) {
//            System.out.println("Ups");
//        }
//    }
//}
