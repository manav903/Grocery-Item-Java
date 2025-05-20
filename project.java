import java.util.*;
class grocery_item{
     String item_name[]=new String[10];
     int item_prices[]=new int[10];
     char s[]=new char[10];
      int total=0;
      int f[]=new int[10];
      int count=0; 
      int a[]=new int[10];
     void display(){
        s[1]='a';
        item_name[1]="milk";
        item_prices[1]=220;
        s[2]='b';
        item_name[2]="coffee";
        item_prices[2]=270;
        s[3]='c';
        item_name[3]="bread";
        item_prices[3]=130;
        s[4]='d';
        item_name[4]="egg";
        item_prices[4]=25;
        s[5]='e';
        item_name[5]="coke oil";
        item_prices[5]=500;
        s[6]='f';
        item_name[6]="black paper";
        item_prices[6]=300;
        s[7]='g';
        item_name[7]="jap";
        item_prices[7]=150;
        s[8]='h';
        item_name[8]="butter ";
        item_prices[8]=220;
        s[9]='i';
        item_name[9]="sugar";
        item_prices[9]=320;

     }
     void funcation(){
      int i,l,k=3;
      int x=1;
      System.out.print("\t\t");
        for(i=1;i<=9;i++){

            for(l=i;l<=k;l++){
                System.out.print(s[x]+")"+" ");
               System.out.print(item_name[l]+"  : ");
               System.out.print(item_prices[l]+"                   ");
               x++;
            }
            System.out.print("\n\t\t");
            i=i+2;
            k=k+3;
        }
        
     }

     void work(){
        int i;
        for(i=0;i<=9;i++){
            a[i]=0;
        }
        System.out.println("");
        System.out.println("select the opation >");
        System.out.println("Once the selection is complete put the zero >");
     }
     void contnue(){
        Scanner sc=new Scanner(System.in);
        char v;
        int y;
        do{
        v=sc.next().charAt(0);
      if(v =='a'||v =='b'||v =='c'||v =='d'||v =='e'||v =='f'||v =='g'||v =='h'||v =='i'){
        y=v;
        y=y-96;
        total=total+item_prices[y];
        f[y]=item_prices[y];
        switch(y){
          case 1 :
          a[1]++;
          break;
          case 2 :
          a[2]++;
          break;
          case 3 :
          a[3]++;
          break;
          case 4 :
          a[4]++;
          break;
          case 5:
          a[5]++;
          break;
          case 6 :
          a[6]++;
          break;
          case 7:
          a[7]++;
          break;
          case 8 :
          a[8]++;
          break;
          case 9 :
          a[9]++;
          break;
          default :
          System.out.println("nothing");
        }
      }  
    }while(v != '0');
     }
     
     void loop(){
        int i;
        for(i=1;i<=a[1];i++){
            System.out.print(item_name[1] + " : ");
            System.out.println(item_prices[1]);
        }
        for(i=1;i<=a[2];i++){
            System.out.print(item_name[2]+ " : ");
            System.out.println(item_prices[2]);
        }
        for(i=1;i<=a[3];i++){
            System.out.print(item_name[3] + " : ");
            System.out.println(item_prices[3]);
        }
        for(i=1;i<=a[4];i++){
            System.out.print(item_name[4] + " : ");
            System.out.println(item_prices[4]);
        }
        for(i=1;i<=a[5];i++){
            System.out.print(item_name[5] + " : ");
            System.out.println(item_prices[5]);
        }
        for(i=1;i<=a[6];i++){
            System.out.print(item_name[6] + " : ");
            System.out.println(item_prices[6]);
        }
        for(i=1;i<=a[7];i++){
            System.out.print(item_name[7] + " : ");
            System.out.println(item_prices[7]);
        }
        for(i=1;i<=a[8];i++){
            System.out.print(item_name[8] + " : ");
            System.out.println(item_prices[8]);
        }
        for(i=1;i<=a[9];i++){
            System.out.print(item_name[9] + " : ");
            System.out.println(item_prices[9]);
        }
       
     }
     void last(){
        System.out.println("......................");
        System.out.print("total   : " + total);
     }
}
class second extends grocery_item{

    void  calls(){
        display();
        funcation();
        work();
        contnue();
        loop();
        last();
    }
}

class project{
    public static void main(String arg[]){
        second s1=new second();
        s1.calls();
        
    }
}