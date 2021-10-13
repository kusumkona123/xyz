public class LFS{
public static void main(String args[]){
int n=args.length;
int a[]=new int[n];
System.out.println("Numbers are:");
for(int i=0;i<n;i++){
a[i]=Integer.parseInt(args[i]);
System.out.println(a[i]+" ");
}
System.out.println("\n First largest number:"+Sort(a,n,1));
System.out.println( "second largest number:"+Sort(a,n,2));
}
public static int Sort(int b[],int size,int choice){
int temp=0;
for(int i=0;i<size-1;i++)
{
 for(int j=0;j<size-i-1;j++)
  if(b[j]>b[j+1])
  { 
    temp=b[j];
    b[j]=b[j+1];
    b[j+1]=temp;
  }
}
if(choice==1){
  return b[size-1];
 }
else
  return b[size-2];
 }
}


