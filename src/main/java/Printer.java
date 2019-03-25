public class Printer {
    private int numberOfSheetsLeft;
    private int toner;

    public Printer(int numberOfSheetsLeft, int toner){
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.toner = toner;
    }

    public int getNumberOfSheetsLeft(){
        return this.numberOfSheetsLeft;
    }

    public int getTonerVolume(){
        return this.toner;
    }

//    public int toPrint(int )

    public void printPages(int pagesToPrint, int numberOfCopies){
        if(this.numberOfSheetsLeft >= pagesToPrint * numberOfCopies){
            this.numberOfSheetsLeft -= pagesToPrint * numberOfCopies;
        }
    }

    public void addSheets(int sheets){
        this.numberOfSheetsLeft += sheets;
    }

    public void tonerDecreasedInVolume(int pages){
        this.toner -= pages;
    }




}
