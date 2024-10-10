package chapter8exercises;

public class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice;
	double  currentPrice;
	
	public Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}
	
	public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
	
	
	public static void main(String[] args) {
		
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		
		stock.setPreviousClosingPrice(34.5);
		stock.setCurrentPrice(34.35);
		
		System.out.printf("Tỷ lệ đôi giá là: %.2f%%\n", stock.getChangePercent());
	}	
	
}