import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //자릿수마다 2진수로 바꿔야하기에 string으로 선언
		String S = br.readLine();
        //2진수 값을 저장해줄 StringBuilder
		StringBuilder sb = new StringBuilder();
		
        //8진수 문자열을 맨 앞자릿수부터 4~7일 경우 4를빼고 sb에 1 저장, 아닐경우 sb에 0저장
       	//2~3일 경우 2를 빼고 sb에 1저장, 아닐 경우 sb에 0 저장
        //1일 경우 1을 뺴고 sb에 1저장, 아닐 경우 sb에 0 저장
		for(int i = 0; i < S.length(); i++) {
			int N = S.charAt(i) - '0';
			if(N >= 4) {
				sb.append(1);
				N -= 4;
			}else {
				sb.append(0);
			}
			if(N >= 2) {
				sb.append(1);
				N -= 2;
			}else {
				sb.append(0);
			}
			if(N == 1) {
				sb.append(1);
				N -= 1;
			}else{
				sb.append(0);
			}
		}
        
        //8진수 맨 앞의 숫자가 1일때 2진수는 001이니 00두개 지워준다.
        //8진수 맨 앞의 숫자가 2~3일때 2진수는 010또는 011이니 0한개 지워준다.
		if(S.charAt(0) == '1') {
			sb.delete(0, 2);
		}else if(S.charAt(0) == '2' || S.charAt(0) == '3') {
			sb.deleteCharAt(0);
		}else if(S.charAt(0) == '0') {
			sb.delete(0, 2);
		}
		System.out.println(sb);
	}
}