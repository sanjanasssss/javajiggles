
public class xylem {
    int num=42345;
    int sum=0;
    public static void main(String[] args) {
      int last=num%10;
      int temp=num/10;
      while(temp>9){
          sum=sum+num%10;
          temp=temp/10;
      }
      int res=temp+last;
        if (temp == res) {
            System.out.println(" The number is a xylem");
        }
        else{
            System.out.println("The number is a phloem");
        }
    }
}

