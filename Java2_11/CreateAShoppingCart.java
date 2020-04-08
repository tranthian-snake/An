package Java2_11;

import java.sql.*;
import java.util.Scanner;

public class CreateAShoppingCart {
    public static void main(String[] args) {
        Products list= new Products();

        list.getProducts();
        System.out.println("Bạn sẽ mua sản phẩm của chúng tôi?");

        System.out.println("1. Tiếp tục mua sản phẩm (chọn Y)" + "\n"+ "2. Không tiếp tục mua sản phẩm (chọn N)" + "\n");



        int choose;
        do{
            do{
                System.out.println("Nhập lựa chọn của bạn: ('Y' hoặc 'N')");
                Scanner scanner = new Scanner(System.in);
                choose = scanner.nextInt();

            }while (choose != 'N' || choose != 'Y');
            switch (choose) {
                case 'Y':
                    list.addCart();
                    break;
                case 'N':
                    int check;
                    do{
                        do{
                            System.out.println("Bạn có muốn thực hiện thanh toán không ( 'Y': có, 'N' : không )");
                            System.out.println("Nhập lựa chọn của bạn: ('Y' hoặc 'N')");
                            Scanner scanner = new Scanner(System.in);
                            check = scanner.nextInt();

                        }while (check != 'N' || check != 'Y');
                        switch (check) {
                            case 'Y':
                                list
                                break;
                            case 'N':
                                list.getProducts();
                                break;
                            default:
                                System.out.println("Nhập lựa chọn của bạn: ('Y' hoặc 'N')");
                        }
                    }while (check != 0);
                    break;
                default:
                    System.out.println("Nhập lựa chọn của bạn: ('Y' hoặc 'N')");
            }
        }while (choose != 0);
    }
}
