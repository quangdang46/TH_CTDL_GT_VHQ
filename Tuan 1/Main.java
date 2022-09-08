import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        QuanLiSV qlsv=new QuanLiSV();
        int select;
        while(true){
            System.out.println("1.Them");
            System.out.println("2.Xoa");
            System.out.println("3.Sua");
            System.out.println("4.In du lieu");

            System.out.println("Moi ban chon:");
            Scanner sc=new Scanner(System.in);
            select=sc.nextInt();
            switch(select){
                case 1:{
                    sc.nextLine();
                    System.out.println("Moi ban nhap sinh vien:");
                    System.out.println("Moi ban nhap id:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Moi ban nhap ten:");
                    String name=sc.nextLine();
                    System.out.println("Moi ban nhap gioi tinh:");
                    String sex=sc.nextLine();
                    qlsv.add(new SV(id,name,sex));
                    break;
                }
                case 4:{
                    System.out.println("Du lieu sinh vien:");
                    qlsv.print();
                    break;
                }
                case 2:{
                    System.out.println("Moi ban nhap id:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    qlsv.remove(id);
                    System.out.println("++++++++++Da xoa thanh cong!!++++++++");
                    break;
                }
                case 3:{
                    System.out.println("Moi ban nhap id cu:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Moi ban nhap id moi:");
                    int newId=sc.nextInt();
                    sc.nextLine();
                    qlsv.update(id,newId);
                    System.out.println("++++++++++Da cap nhat thanh cong!!++++++++");
                    break;
                }
            }
        }


    }
}