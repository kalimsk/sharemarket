import org.junit.Assert;
import org.junit.Test;


public class ShareMarketTest {

    ShareMarket shareMarket = new ShareMarket();
    @Test
    public void calculateMaxProfit1() {
        int[] price = { 3,3,5,0,0,3,1,4 };
        Assert.assertTrue(shareMarket.calculateMaxProfit(price,2)==6);
    }

    @Test
    public void calculateMaxProfit2() {
        int[] price = { 1,2,3,4,5 };
        Assert.assertTrue(shareMarket.calculateMaxProfit(price,2)==4);
    }

    @Test
    public void calculateMaxProfit3() {
        int[] price = { 7,6,4,3,1 };
        Assert.assertTrue(shareMarket.calculateMaxProfit(price,2)==0);
    }
}