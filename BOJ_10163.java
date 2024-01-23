import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10163 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[1001][1001];
		int[] cd = new int[4];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				cd[j] = Integer.parseInt(st.nextToken());
			} //여기까지가 입력 받는 곳

			for (int l = cd[1]; l < cd[1] + cd[3]; l++) {
				for (int k = cd[0]; k < cd[0] + cd[2]; k++) {
					arr[k][l] = i + 1; //탐색을 계속 하면서, i+1 값(탐색 당한 횟수)
				}
			}
		}
		
		for(int i = 1; i <= N; i++) {
			int count = 0;
			for(int k = 0; k < 1001; k++) {
				for(int l = 0; l < 1001; l++) {
					if(arr[k][l] == i) {
						count++; //전체 배열 돌면서 count를 체크하면, 1,2,...,
						//N번 째 사각형이 차지하는 넓이 나옴
					}
				}
			}
			System.out.println(count);
		}
}
}