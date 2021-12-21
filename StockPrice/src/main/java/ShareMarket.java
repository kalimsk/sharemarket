public class ShareMarket {

    public int calculateMaxProfit(int price[], int maxNoOfTran)
    {
        int n = price.length;
        int tranProfitMatrix[][] = new int[maxNoOfTran + 1][ n + 1];
        for (int i = 0; i <= maxNoOfTran; i++) {
            tranProfitMatrix[i][0] = 0;
        }

        for (int j = 0; j <= n; j++) {
            tranProfitMatrix[0][j] = 0;
        }

        for (int i = 1; i <= maxNoOfTran; i++) {
            int value = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++) {
                value = Math.max(value, tranProfitMatrix[i - 1][j - 1] - price[j - 1]);
                tranProfitMatrix[i][j] = Math.max(tranProfitMatrix[i][j - 1], price[j] + value);
            }
        }

        return tranProfitMatrix[maxNoOfTran][n - 1];
    }
}
