import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPrinter {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 60);
    }

    @Test
    public void numberofSheetsinPrinter(){
        assertEquals(100, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void tonerVolume(){
        assertEquals(60, printer.getTonerVolume());
    }

    @Test
    public void toPrint(){
        printer.printPages(5, 5);
        assertEquals(75, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void addSheets(){
        printer.addSheets(50);
        assertEquals(150, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void tonerDecresedInVolume(){
        printer.tonerDecreasedInVolume(10, 2);
        assertEquals(40, printer.getTonerVolume());
    }




}
