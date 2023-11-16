/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nha_sach;
/*
Ý tưởng: 
- Là một chủ hiệu sách, tôi muốn có một chương trình cho phép người dùng xem toàn bộ danh sách của thư viện.
- Danh sách này phải bao gồm tiêu đề, tác giả, thể loại và ngày xuất bản của cuốn sách.
- Hệ thống nên có chức năng đăng nhập, mặc định khi vào hệ thống sẽ yêu cầu tên đăng nhập, rồi sau đó nhập mật khẩu
    + Nếu là chủ cửa hàng sẽ chỉ có 1 tên đăng nhập là admin, mật khẩu là admin.
    + Nếu là khách có tên đăng nhập là cilent < khách > -> không cần nhập mật khẩu
- Nếu là admin thì có các chức năng sau:
    + Thêm sách mới
    + Xóa sách
    + Sửa sách
    + Các chức năng của khách để test
    + thoát tài khoản admin
- Nếu là khách thì có các chức năng sau:
    + Tìm kiếm sách ( 1 hoặc nhiều trong các mục )
        - Tiêu đề 
        - Tác giả
        - Thể loại
        - Ngày xuất bản
    + Xem danh sách
-> 1 lớp sách
-> 1 lớp quản lí danh sách sách
    + Làm các chức của sách bao gồm
        - thêm
        - sửa
        - xóa
        - tìm kiếm sách
        - xem danh sách sách
-> 1 lớp cách đăng nhập
    + cách đăng nhập
    + admin
    + khach
-> 1 lớp thao tác của khách hoặc admin
-> gọi lớp thao tác trong main
 */
public class Nha_sach {
    
    public static void main(String[] args) {
        Process process = new Process();
        process.play();
    }
    
}
