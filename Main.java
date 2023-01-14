class Main {
  public static void main(String[] args) {
    Author object = new Author();
    System.out.println("Author name: " + object.authorName + ", books: ");
    String books[] = object.bookByAuthor;
    for(int i = 0; i < books.length;i++){
      System.out.println(books[i]);
    }
  }
}
