package Pck01;
import java.util.*;

public class Longest_SubString {
	static final int words = 256;
	static int long_substring(String str)
{
		int n = str.length();

				int res = 0;
				int [] lastIndex = new int[words];
				Arrays.fill(lastIndex, -1);
				int i = 0;
	
				
				for (int j = 0; j < n; j++) {
					i = Math.max(i, lastIndex[str.charAt(j)] + 1);
					res = Math.max(res, j - i + 1);
					lastIndex[str.charAt(j)] = j;
				}
				return res;
			}
			public static void main(String[] args)
			{
				String str = "abcabcbb";
				int len = long_substring(str);
				System.out.println(len);
			}
		}

