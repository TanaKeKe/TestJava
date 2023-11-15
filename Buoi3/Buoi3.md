# Buổi 3: Cách Java lưu trữ dữ liệu

## Cách Java lưu trữ dữ liệu

### 1. Bằng kiểu dữ liệu nguyên thủy
- Kiểu dữ liệu nguyên thủy là các kiểu dữ liệu đơn giản, không phải là đối tượng, và chỉ chứa một giá trị duy nhất. Các kiểu dữ liệu nguyên thủy trong Java bao gồm: boolean, char, byte, short, int, long, float, và double.
- Java lưu trữ dữ liệu bằng kiểu dữ liệu nguyên thủy trong chính bản thân biến, tức là giá trị của biến được lưu trữ trực tiếp trong vùng nhớ được cấp phát cho biến đó. 
- Mỗi kiểu dữ liệu nguyên thủy có một kích thước bộ nhớ cố định, ví dụ: byte là 1 byte, int là 4 byte, long là 8 byte, v.v.
- Khi thực hiện các phép toán hoặc gán giá trị cho các biến kiểu dữ liệu nguyên thủy, Java sẽ sao chép giá trị của biến nguồn sang biến đích, không có sự tham chiếu hay liên kết nào giữa hai biến.

> ***Điều này có nghĩa là khi thay đổi giá trị của một biến, giá trị của biến khác không bị ảnh hưởng.***

- Có thể tham khảo ví dụ và giải thích chi tiết ở các nguồn sau:
  - [that2u.com](http://that2u.com/java-kieu-du-lieu-nguyen-thuy-va-kieu-du-lieu-tham-chieu/)
  - [Cafeincode](https://cafeincode.com/kieu-du-lieu-trong-java-va-tac-dung-cua-no/)

### 2. Bằng kiểu dữ liệu object và class object

- Kiểu dữ liệu object là các kiểu dữ liệu phức tạp, là đối tượng, và có thể chứa nhiều giá trị khác nhau. Các kiểu dữ liệu object trong Java bao gồm: array, class, interface, enum, và các lớp đóng gói (wrapper) của các kiểu dữ liệu nguyên thủy.
- Java lưu trữ dữ liệu bằng kiểu dữ liệu object trong một vùng nhớ riêng biệt gọi là heap, không phải trong chính bản thân biến.
- Biến chỉ lưu trữ địa chỉ của vùng nhớ đó, tức là biến chỉ là một tham chiếu (reference) đến object. Mỗi object có một định danh duy nhất (identity) và có thể được truy cập bằng nhiều biến khác nhau.
>***Khi thực hiện các phép toán hoặc gán giá trị cho các biến kiểu dữ liệu object, Java sẽ sao chép địa chỉ của object từ biến nguồn sang biến đích, có sự tham chiếu hay liên kết giữa hai biến23. Điều này có nghĩa là khi thay đổi giá trị của một object, giá trị của tất cả các biến tham chiếu đến object đó cũng bị ảnh hưởng.***
- Có thể tham khảo ví dụ và giải thích chi tiết về kiểu dữ liệu object ở các nguồn sau:
  - [VietTuts.vn](https://viettuts.vn/java/lop-object-trong-java)
  - [gochocit.com](https://gochocit.com/ngon-ngu-lap-trinh/doi-tuong-object-va-cach-su-dung-doi-tuong-trong-java)
### 3. Wrapper, boxing and unboxing in Java.
- Wrapper trong Java là một khái niệm quan trọng trong lập trình hướng đối tượng. Wrapper là một lớp đặc biệt cung cấp cơ chế để chuyển đổi các kiểu dữ liệu nguyên thủy (primitive types) thành các đối tượng (objects) và ngược lại.

![Alt text](image-1.png)

- Các lớp Wrapper trong Java có thể được sử dụng để:
  - Tạo ra các đối tượng từ các giá trị nguyên thủy bằng cách sử dụng các phương thức valueOf() hoặc các hàm tạo (constructors) của các lớp Wrapper
  - Chuyển đổi các đối tượng thành các giá trị nguyên thủy bằng cách sử dụng các phương thức xxxValue() của các lớp Wrapper, trong đó xxx là tên của kiểu nguyên thủy tương ứng.
  - Thực hiện các phép toán và so sánh trên các đối tượng bằng cách sử dụng các phương thức parseXxx(), compare(), compareTo(), equals(), hashCode(), toString(), và các phương thức khác của các lớp Wrapper.
  - Sử dụng các đối tượng trong các cấu trúc dữ liệu như mảng (array), danh sách (list), tập hợp (set), bản đồ (map), v.v. Các cấu trúc dữ liệu này chỉ chấp nhận các đối tượng, không chấp nhận các kiểu nguyên thủy.
  - Tận dụng tính năng autoboxing và unboxing của Java, tức là chuyển đổi tự động giữa các kiểu nguyên thủy và các lớp Wrapper khi cần thiết.
>_Bạn có thể tham khảo thêm về lớp Wrapper trong Java ở các nguồn sau:_
  - [Viettus.vn](https://viettuts.vn/java/lop-wrapper-trong-java)
  - [kungfutech.edu.vn](https://kungfutech.edu.vn/bai-viet/java/lop-wrapper-trong-java)

## CÁC PHƯƠNG THỨC KHỞI TẠO TRONG JAVA
- Các phương thức khởi tạo phải có cùng tên với tên lớp của chúng.
- Các phương thức khởi tạo không có kiểu trả về, kể cả void.
- Các phương thức khởi tạo được gọi tự động khi một đối tượng được tạo ra bằng toán tử new.
- Các phương thức khởi tạo có thể được nạp chồng, tức là có nhiều phương thức khởi tạo khác nhau trong một lớp, với các tham số khác nhau.
- Các phương thức khởi tạo có thể gọi đến các phương thức khởi tạo khác trong cùng một lớp bằng từ khoá this, hoặc gọi đến các phương thức khởi tạo của lớp cha bằng từ khoá super.
>***Mục đích chính của các phương thức khởi tạo là để khởi tạo các giá trị ban đầu cho các thuộc tính của đối tượng, hoặc thực hiện các công việc khác liên quan đến đối tượng. Các phương thức khởi tạo giúp đảm bảo tính toàn vẹn và an toàn của đối tượng.***
### 1. Từ khóa this
- Trong Java, ta sử dụng từ khóa `this` để tham chiếu đến đối tượng hiện tại.
```java
class Student {
    
    String name;
    
    void displayName() {
        System.out.println("Name using this: " + this.name);
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        
        student1.name = "Tân";
        student1.displayName();
        
        // print name using object
        System.out.println("Name using object: " + student1.name);
    }
}
```
Đầu ra:
```java
1 | Name using this: Tân
2 | Name using object: Tân
```
- Trong ví dụ trên, bạn có thể thấy cả `student1.name` và `this.name` đều in ra cùng một kết quả là `Tân`.
- Về cơ bản, khi chúng ta gọi phương thức `displayName()` bằng cách sử dụng đối tượng `student1`, lệnh gọi sẽ tham chiếu đến đối tượng hiện tại, `student1`. Do đó, ta nhận được đầu ra là `Tân` (giá trị của name cho `student1`).
### 2. Từ khóa super
- Chúng ta biết rằng khi một phương thức xuất hiện trong cả lớp cha và lớp con, phương thức trong lớp con sẽ ghi đè phương thức trong lớp cha.
```java
class bo {
    public void speak() {
        System.out.println("Tân ơi xuống ăn cơm");
    }
}
class con extends bo {
    public void speak() {
        System.out.println("Bố ơi con không ăn cơm");
    }
}
public class Practice_Java {

    public static void main(String[] args) {
        con a = new con();
        a.speak();
    }
    
}
```
Đầu ra:
```java
1 | Bố ơi con không ăn cơm
```
- Trong trường hợp này phương thức `speak()` bị ghi đè ở lớp con là lớp `con`, trong trường hợp ta muốn gọi phương thức của lớp trước lúc bị ghi đè thì ta sẽ dùng tới từ khóa `super`

VD:
```java
class bo {
    public void speak() {
        System.out.println("Tân ơi xuống ăn cơm");
    }
}
class con extends bo {
    public void speak() {
        super.speak();
        System.out.println("Bố ơi con không ăn cơm");
    }
}
public class Practice_Java {

    public static void main(String[] args) {
        con a = new con();
        a.speak();
    }
    
}
```

Đầu ra:
```java
1 | Tân ơi xuống ăn cơm
2 | Bố ơi con không ăn cơm
```
## Garbage Collector trong Java
- Garbage Collector là một chương trình chạy nền, theo dõi toàn bộ các đối tượng trong bộ nhớ heap và tìm ra những đối tượng nào không còn được tham chiếu nữa. 
-  Các đối tượng này sẽ được Garbage Collector thu hồi và xóa bỏ để giải phóng bộ nhớ cho các đối tượng mới.
-  Garbage Collector hoạt động theo một số thuật toán khác nhau, tùy thuộc vào phiên bản và cấu hình của JVM. Một số thuật toán phổ biến là: Serial, Parallel, Concurrent Mark Sweep, G1, ZGC, Shenandoah, v.v.
-  Garbage Collector sử dụng các phương thức mark and sweep để xác định và loại bỏ các đối tượng không còn được tham chiếu. Phương thức mark sẽ duyệt qua các đối tượng trong heap và đánh dấu những đối tượng nào còn được tham chiếu. Phương thức sweep sẽ xóa bỏ những đối tượng không được đánh dấu và nén lại bộ nhớ heap.
- Bạn có thể tìm hiểu thêm qua tài liệu:
  - [Codelearn.io](https://codelearn.io/sharing/garbage-collectors-trong-java)

## Pass by Value trong Java
- Tên gọi khác là Truyền tham trị
- Truyền tham trị là việc ta clone ra một bản sao (tạo ra một giá trị mới bằng cách copy giá trị gốc) và thao tác với giá trị của bản sao đó và không làm thay đổi giá trị của bản gốc.
- Hiểu đơn giản là khi truyền dữ liệu vào hàm và tương tác thì dữ liệu chỉ thay đổi trong hàm đó, mà không làm thay đổi giá trị gốc ban đầu ngoài hàm.

```java
public class Main {
    public static void modify(int x, int y) {
        x = 100;
        y = 200;
        System.out.println("X - Y from modify: " + x + " - " + y);
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println("X - Y before modify: " + x + " - " + y);
        
        modify(x, y);

        System.out.println("X - Y after modify: " + x + " - " + y);
    }

}
```
Đầu ra:
```java
X – Y before modidy: 1 – 2
X – Y from modidy: 100 – 200
X – Y after modidy: 1 – 2
```

![Alt text](image-2.png)