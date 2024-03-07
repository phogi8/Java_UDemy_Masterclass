package sec8;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel <= 100 && tonerLevel > -1 ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        int temp;
        if (tonerAmount > 0 && tonerAmount <= 100) {
            temp = this.tonerLevel + tonerAmount;
            if (temp <= 100) {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }

        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint;

        if (this.duplex) {
            pagesToPrint = (int) Math.ceil(pages / 2.0);
        } else {
            pagesToPrint = pages;
        }

        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
