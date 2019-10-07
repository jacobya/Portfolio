public class BuyCar {

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
    int[] ret = new int[2];
    double priceOld = startPriceOld;
    double priceNew = startPriceNew;
    double savings = 0;
    double save = 0;
    int numMonth = 0;
    double percent = percentLossByMonth/100;
    if(priceOld >= priceNew){
      ret[0] = 0;
      ret[1] = startPriceOld - startPriceNew;
      return ret;
    }
    do{
      numMonth++;
      if(numMonth % 2 == 0) 
        percent += .005;
      priceOld = priceOld - (priceOld * percent);
      priceNew = priceNew - (priceNew * percent);
      savings += savingperMonth;
      System.out.println((savings + priceOld) - priceNew);
    }while ((savings+priceOld) <= priceNew);
    save = savings + priceOld - priceNew;
		ret[0] = numMonth;
    ret[1] = (int)Math.round(save);
    return ret;
	}
}
