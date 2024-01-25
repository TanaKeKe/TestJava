# INTERFACE VÀ TRỪU TƯỢNG

## 1. Interface

#### Khái niệm
- Interface là một bản mẫu có thể được sử dụng để triển khai một lớp. Interface không chứa bất kỳ phương thức cụ thể nào (phương thức có mã) mà chỉ chứa chứa các phương thức trừu tượng (abstract methods) và các hằng số (constants). Các phương thức trong interface không có thân (body) và chỉ định tên, tham số và kiểu trả về.

- Interface không phải là một đối tượng và không thể được khởi tạo. Tuy nhiên, các lớp triển khai (implement) interface có thể được khởi tạo. Interface không chứa các biến thể hiện (instance variables), nhưng nó có thể chứa các biến public static final (constants) để định nghĩa các giá trị hằng số cho các lớp triển khai.

#### Khi nào cần sử dụng Interface ?

- Để đạt được tính trừu tượng hoàn toàn.
- Để hỗ trợ giải quyết phương thức động tại thời điểm chạy.
- Giúp bạn đạt được kết nối lỏng (Loose Coupling).
- Cho phép bạn tách định nghĩa của một phương thức khởi thừa kế phân cấp.
- Muốn cung cấp chức năng (functionality) trên nhiều đối tượng khác biệt. Abstract class chỉ nên sử dụng chủ yếu cho các đối tượng có liên quan chặt chẽ, trong khi Interface phù hợp nhất để cung cấp chức năng chung cho các lớp không liên quan.
- Khi chúng ta muốn có một cái gì đó tương tự như kế thừa đa năng vì chúng ta có thể thực hiện nhiều giao diện.
- Khi ta thiết kế các đoạn chức năng nhỏ, ngắn gọn. Nếu chúng ta thiết kế các đoạn chức năng lớn hơn, hãy sử dụng lớp trừu tượng.

## 2. Abstract class

#### Khái niệm
- Trong Java, abstract class là một lớp mà không thể tạo ra một đối tượng (instance) trực tiếp từ lớp đó. Thay vào đó, nó được sử dụng để tạo ra các lớp con (subclasses) kế thừa các thuộc tính và phương thức của lớp cha (superclass).
- Một abstract class được khai báo bằng cách sử dụng từ khóa “abstract” trước từ khóa “class”. Nó có thể chứa các phương thức trừu tượng (abstract methods), các phương thức cụ thể (concrete methods), các biến và các hằng số.
- Các phương thức trừu tượng không có thân (body) và cần được khai báo trong các lớp con của abstract class. Các lớp con phải triển khai (implement) tất cả các phương thức trừu tượng của lớp cha.
- Abstract class thường được sử dụng để định nghĩa các lớp cơ sở (base classes) trong một hệ thống lớp phức tạp, và để đảm bảo tính đa hình (polymorphism) trong mã Java.

#### Khi nào thì nên sử dụng Abstract Class ?
- Cung cấp chức năng mặc định cho các lớp con.
- Cung cấp một mẫu (template) cho các lớp cụ thể trong tương lai.
- Giúp bạn định nghĩa một giao diện chung cho các lớp con của nó.
- Lớp trừu tượng cho phép tái sử dụng mã (code reusability).
- Khi ta muốn sử dụng tính kế thừa vì Abstract Class cung cấp một cài đặt lớp cơ sở chung cho các lớp được kế thừa.
- Khi ta muốn khai báo các thành viên không công khai.
- Khi chúng ta muốn thêm các phương thức mới.
- Nếu chúng ta muốn tạo nhiều phiên bản của thành phần. Bằng cách cập nhật lớp cơ sở, tất cả các lớp kế thừa sẽ tự động được cập nhật với thay đổi đó.
- Tăng khả năng tương thích chuyển tiếp (forward compatibility). - Nếu sử dụng interface, chúng ta không thể thay đổi mà không làm hỏng mã nguồn nhưng nếu dùng lớp abstract class, chúng ta vẫn có thể thêm hành vi mà không làm hỏng mã nguồn hiện tại.
- Nếu muốn cung cấp chức năng đã được thực hiện chung cho tất cả các triển khai của thành phần của chúng ta. Lớp trừu tượng cho phép chúng ta triển khai một phần của lớp.

## 3. Sự khác nhau giữa Interface và abstract

>#### Vai trò
**Interface**: Cung cấp một khung (template) cho các lớp khác thực hiện. Nó đặt ra một bộ quy tắc mà các lớp cần tuân thủ nếu muốn triển khai interface đó. Điều này giúp đạt được tính đa hình trong lập trình hướng đối tượng.

**Abstract class**: Xác định danh tính cơ bản của một lớp và tính năng chung của các lớp con. Abstract class định nghĩa một khung chung cho các lớp con kế thừa và chia sẻ một số thuộc tính và phương thức.

>#### Kế thừa
**Interface**: Có thể triển khai nhiều interface để đạt đa kế thừa. Điều này cho phép một lớp kết hợp nhiều tính năng từ nhiều interface khác nhau mà không phải lo lắng về sự xung đột giữa các phương thức từ các nguồn khác nhau. Ví dụ: Lớp A có thể triển khai interface B và C cùng một lúc để sử dụng các phương thức của B và C.

**Abstract class**: Chỉ có thể triển khai 1 lớp trừu tượng, không đạt đa kế thừa. Điều này có nghĩa là một lớp chỉ có thể kế thừa từ một lớp trừu tượng một lần. Vì vậy, hạn chế khả năng mở rộng của một lớp khi sử dụng abstract class so với interface.

>#### Tính trừu tượng
**Interface**: Các phương thức trong interface không có cài đặt cụ thể, chỉ định các hành động cần thiết để thực hiện một tính năng cụ thể. Do đó, interface đạt tính trừu tượng hoàn toàn (100%).

**Abstract class**: chứa các phương thức trừu tượng và phương thức cụ thể (concrete methods) mà các lớp con có thể tái sử dụng. Do đó không đạt tính trừu tượng hoàn toàn (100%).

>#### Phương thức
**Interface**: Trước đó, Interface phương thức trừu tượng (abstract method), từ Java 8 có thêm phương thức default và static. Điều này đảm bảo các lớp triển khai interface phải tuân theo một bộ quy tắc phương thức.

**Abstract class**: Bao gồm hương thức trừu tượng và phương thức cụ thể (concrete). Điều này cho phép abstract class định nghĩa cách thức hoạt động của một số phương thức, trong khi vẫn giữ tính trừu tượng của các phương thức khác.

>#### Biến

**Interface**: Chỉ có biến static và biến final. Điều này đảm bảo các biến trong interface không thay đổi và không cần được khởi tạo lại ở mỗi lớp triển khai interface.

**Abstract class**: Biến final, biến non-final, biến static, biến non-static. Điều này cho phép abstract class chứa các biến có khả năng thay đổi giá trị và được sử dụng trong các lớp con.

>#### Khai báo

**Interface**: Sử dụng từ khóa “interface” để khai báo. 
**Ví dụ:**
```java
 public interface Cuoi { … }
```

**Abstract class**: Sử dụng từ khóa “abstract” để khai báo. 
**Ví dụ:**
```java
 public abstract class Danh { … }
```

>#### Access Modifier

**Interface**: Mặc định là public và không thể thay đổi phạm vi truy cập. Tất cả các phương thức trong interface đều phải được định nghĩa là public để lớp triển khai nó có thể truy cập và thực thi chúng.

**Abstract class**: Có thể có bất kỳ phạm vi truy cập nào, bao gồm private, protected và public. Điều này cho phép abstract class định nghĩa các phương thức và thuộc tính bên trong với các mức độ truy cập khác nhau.

>#### Trường dữ liệu

**Interface**: Không chứa trường dữ liệu, chỉ có thể chứa phương thức và hằng số. Điều này giúp giữ interface đơn giản và tập trung vào việc định nghĩa hành vi của lớp.

**Abstract class**: Có thể chứa các trường dữ liệu cùng với các phương thức abstract và non-abstract. Điều này cho phép abstract class chia sẻ các thuộc tính dữ liệu giữa các lớp con kế thừa từ nó.

>#### Quan hệ

**Interface**: Đại diện cho mối quan hệ “Like-A”. Khi một lớp triển khai một interface, lớp đó được xem như có tính năng giống interface đó.

**Abstract class**: Đại diện cho mối quan hệ “Is-A”. Khi một lớp kế thừa từ một abstract class, lớp đó được xem như là một phiên bản cụ thể của lớp cha.

>#### Giới hạn mở rộng
**Interface:** Nó có thể mở rộng bất kỳ số lượng interface nào. Ví dụ: 
```java
public interface A extends B, C, D { … }
```

**Abstract class:** Nó chỉ có thể mở rộng một lớp hoặc một abstract class một lần.
Ví dụ:
```java
public abstract class A extends B { … }
``` 

>#### Constructor và Destructor
**Interface:** Do Interface không thể khởi tạo được, do đó không có constructor hay destructor.

**Abstract class**: Có thể có nhưng thường không được sử dụng trực tiếp vì abstract class không thể tạo ra instance. Constructor và destructor trong abstract class thường được sử dụng để khởi tạo hoặc dọn dẹp các tài nguyên chung cho các lớp con kế thừa từ nó.

