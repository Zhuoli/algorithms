package algorithms;

public class KMP {
	
	public int kmpMatch(String s, String p){
		int[] next = new int[s.length()];
		int i,j;
		i=0;
		j=0;
		getNext(p,next);
		while(i<s.length()){
			if(j==-1||s.charAt(i)==p.charAt(j)){
				i++;
				j++;
			}else{
				j=next[j]; // eliminate Trace Back
			}
			if(j==p.length()){
				return i-p.length();
			}
		}
		return -1;
	}
	
	private void getNext(String p, int[] next){
		int j,k;
		next[0]=-1;
		j=0;
		k=-1;
		while(j<p.length()-1){
			if(k==-1 || p.charAt(j)==p.charAt(k)){
				j++;
				k++;
				next[j]=k;
			}else{
				k=next[k];
			}
		}
	}
	
	public static void main(String[] args){
		KMP instance = new KMP();
		String s="bacbababaabcbab";
		String p="ababaca";
		int index=instance.kmpMatch(s, p);
		if(index>0){
			System.out.println(s.substring(index));
		}else{
			System.out.println("Don't match!");
		}
	}
}
