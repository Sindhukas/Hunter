package Hunter;

public class RotateArray {
	public static void main(String[] args){
		RotateArray rotate=new RotateArray();
		int arr[]={1,2,3,4,5,6,7};
		rotate.leftRotate(arr,2,7);
		rotate.printArray(arr,7);
	}
		void printArray(int arr[],int size){
			int i;
			for(i=0;i<size;i++){
				System.out.print(arr[i]+" ");
			}
		}
		void leftRotate(int arr[],int d,int n){
			int i;
			for(i=0;i<d;i++){
				leftRotate1(arr,n);
			}
		}
		void leftRotate1(int arr[],int n){
			int i,temp;
			temp=arr[0];
			for(i=0;i<n-1;i++)
				arr[i]=arr[i+1];
			arr[i]=temp;
		}
}
