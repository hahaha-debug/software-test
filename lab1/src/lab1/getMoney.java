package lab1;

public class getMoney {
	int[] pocket = {50,20,10,5,5,1,1,1};
	public boolean judge(int money,int n) {//from the pocket[n] judge
		
		int allMoney = 0;
		for(int i=n;i<pocket.length;i++) {
			allMoney+=pocket[i];
		}
		if(allMoney<money) {
			return false;
		}else if(money==0){
			return true;
		}else {
			for(int i=n;i<pocket.length;) {
				if(money>pocket[i]) {
					money-=pocket[i];
					i++;
					if(judge(money,i)) {
						return true;
					}else {
						return false;
					}
				}else if(money==pocket[i]) {
					return true;
				}else {
					i++;
				}
			}
			return false;
		}	
	}
}
