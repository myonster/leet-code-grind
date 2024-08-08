class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
		int counterFive = 0;
		int counterTen = 0;
		int counterTwenty = 0;
		
		for (int money : bills) {
			switch (money) {
				case 5:
					counterFive += 5;
					//System.out.println("Collecting $5");
					//System.out.println("Counter current: $ " + counter);
					break;

				case 10: {
					if ((money - 5) > counterFive) {
						return false;
					}

					counterTen += 10;
					counterFive -= 5;
					break;
				}
				case 20: {
					if((money - 5) > (counterFive + counterTen) || counterFive < 5) {
						return false;
					} else {
						if (counterTen >= 10) {
							counterTen -= 10;
							counterFive -= 5;
						} else {
							counterFive -= 15;
						}
					}
					
					break;
				}
			}
		}

		return true;
    }
}
