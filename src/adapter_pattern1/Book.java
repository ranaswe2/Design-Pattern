package adapter_pattern1;

public interface Book {
    int getPage();
    void open();
    void turnPage();
}



class PaperBook implements Book{

    int page;
    @Override
    public int getPage() {
        return page;
    }

    @Override
    public void open() {

        page=1;
    }

    @Override
    public void turnPage() {

        page+=1;
    }
}


interface EBook{
    void unlock();
    void nextPage();
    int getPage();
}


class EBookReader implements EBook{

    boolean isLock=true;
    int page;
    int maxPage=100;

    @Override
    public void unlock() {
        if(isLock)
            page=1;
    }

    @Override
    public void nextPage() {
        if(page<=maxPage)
            page+=1;
        else return;
    }

    @Override
    public int getPage() {
        return page;
    }
}



class EBookPageAdapter implements Book{

    private EBook eBook;

    public EBookPageAdapter(EBook eBook) {
        this.eBook = eBook;
    }

    @Override
    public int getPage() {
        return eBook.getPage();
    }

    @Override
    public void open() {
        eBook.unlock();
    }

    @Override
    public void turnPage() {
        eBook.nextPage();
    }
}


class Main{
    public static void main(String[] args) {
        EBook eb= new EBookReader();
        eb.unlock();
        eb.nextPage();
        eb.nextPage();
        System.out.println("Current Page: "+eb.getPage());

        Book book= new EBookPageAdapter(eb);
        book.open();
        book.turnPage();
        book.turnPage();
        System.out.println("Current Page: "+book.getPage());
    }
}
