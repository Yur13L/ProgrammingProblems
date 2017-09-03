import java.util.Stack;

public class SMSProblem {

	public static void main(String[] args) {
		SMSProblem o = new SMSProblem();
		System.out.println(o.solution("MORE THAN YOU KNOW", 9));
	}

	public int solution(String S, int K) {

		String[] stringSms = S.split(" ");

		Stack<SMS> smsStack = new Stack<SMS>();

		SMS currentSMS = new SMS(K);
		smsStack.push(currentSMS);
		
		
		

		for (String currentString : stringSms) {

			int result;
			
			if(currentSMS.currentString == ""){
				result = currentSMS.addMessage(currentString);
			}else{
				result = currentSMS.addMessage(" " + currentString);
			}
			
			if (result == -1) {
				return -1;
			}

			if (result != 1) {
				currentSMS = new SMS(K);
				smsStack.push(currentSMS);
				currentSMS.addMessage(currentString);
			}
		}
		
		for(SMS curSMS : smsStack){
			System.out.println(curSMS.currentString);
		}
		
		return smsStack.size();
	}

	private class SMS {

		int maxText;
		public String currentString;
		

		public SMS(int maxText) {
			this.maxText = maxText;
			this.currentString = "";
		}

		/**
		 * 
		 * @param x the string to be added to sms
		 * @return [1,0,-1] Returns 1 if successfully added to SMS, 
		 * returns 0 if not sucessfull if reason current length plus new string does not fit, 
		 * returns -1 if sms is larger than sms maxtext
		 */
		public int addMessage(String x) {

			if (x.length() > maxText) {
				return -1;
			}

			if (x.length() + currentString.length() <= maxText) {
				currentString += x;
				return 1;
			} else {
				return 0;
			}
		}
	}

}
