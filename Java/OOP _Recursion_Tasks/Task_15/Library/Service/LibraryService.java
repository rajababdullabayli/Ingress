package Task_15.library.service;

public class LibraryService {
    public static class Statistics{
        public void getBookCount(String[] bookNames, int index){
            if (bookNames == null){
                System.out.println("Count of the books: 0");
                return;
            }
            System.out.println("Count of the books: "+bookNames.length);
        }
        public void printBookRecursive(String[] bookNames, int index){
            if(bookNames == null || index >= bookNames.length){
                return;
            }
            System.out.println("Book's name: "+ bookNames[index]);
            printBookRecursive(bookNames,index+1);
        }
    }
}
