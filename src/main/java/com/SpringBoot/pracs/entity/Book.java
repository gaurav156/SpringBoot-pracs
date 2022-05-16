package com.SpringBoot.pracs.entity;

public class Book {
        private String bookId;
        private String bookTitle;
        private String bookIssnNo;

        public Book(String bookId, String bookTitle, String bookIssnNo) {
                this.bookId = bookId;
                this.bookTitle = bookTitle;
                this.bookIssnNo = bookIssnNo;
        }

        public String getBookId() {
                return bookId;
        }

        public void setBookId(String bookId) {
                this.bookId = bookId;
        }

        public String getBookTitle() {
                return bookTitle;
        }

        public void setBookTitle(String bookTitle) {
                this.bookTitle = bookTitle;
        }

        public String getBookIssnNo() {
                return bookIssnNo;
        }

        public void setBookIssnNo(String bookIssnNo) {
                this.bookIssnNo = bookIssnNo;
        }

}
