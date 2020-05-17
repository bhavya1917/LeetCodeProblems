package LeetCodeProblems;

public class BuySellStockLeetCode {

	public static void main(String[] args) {
		int intArray[]=new int[]{3,5,3,4,1,4,5,0,7,8,5,6,9,4,1};
		System.out.println(maxProfit(intArray));
	}

	public static int maxProfit(int[] prices) {
		int res = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1])
				res = res + prices[i + 1] - prices[i];
		}
		return res;
	}

}
