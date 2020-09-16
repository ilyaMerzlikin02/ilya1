package ru.mirea.lab1;

public class Book {
    public static class book{
        private int sheets_num;
        private String genre;
        private String author;
        private String book_name;
        book(int sheets_num, String genre, String author, String book_name)
        {
            this.sheets_num=sheets_num;
            this.genre=genre;
            this.author=author;
            this.book_name=book_name;
        }

        @Override
        public String toString() {
            return "book{" +
                    "sheets_num=" + sheets_num +
                    ", genre='" + genre + '\'' +
                    ", author='" + author + '\'' +
                    ", book_name='" + book_name + '\'' +
                    '}';
        }
    }
    public static void main(String[]args)
    {
        book b1 = new book(150, "Roman","London" ,"The Call of the Wild");
        System.out.println(b1);
    }
}