package chapter8;

public class Example2 {

	/**
	 * Mối quan hệ giữa một đối tượng và lớp định nghĩa của nó là:
	 * 
	 * - Lớp là một bản thiết kế, đối tượng là một thể hiện:
	 * 		 + Lớp là bẩn thiết kế,
	 * 		khuôn mẫu để định nghĩa những thuộc tính và hành vi của đối tượng của lớp. 
	 * 	   	 + Đối tượng là một thể hiện cụ thể được tạo ra từ lớp, với các giá trị cụ thể
	 * 		cho các thuộc tính và khả năng thực hiện các hành vi đã được lớp định nghĩa.
	 * - Lớp định nghĩa những gì đối tượng sẽ có và có thể làm.
	 * - Đối tượng là phiên bản cụ thể của lớp với các giá trị riêng cho các thuộc tính.
	 * 	 Trong khi lớp chỉ là một mô tả trừu tượng, thì đối tượng là phiên bản sống động
	 * 	 có giá trị cụ thể và có thể thực hiện hành động.
	 * - Tính độc lập của đối tượng: mặc dù có chung phương thức và thuộc tính nhưng mỗi đối
	 *   tương lại  có trang thái riêng biệt.
	 * - Quá trình khởi tạo đối tượng: khởi tạo bằng từ khóa "new" trong java. khi 1 đối tượng
	 *   được khởi tạo, một bản sao của tất cả thuộc tính và phương thức trong lớp đc tạo ra cho đối tượng đó.
	 * 
	 */

	/**
	 * Cách để định nghĩa 1 lớp là:
	 * - định nghĩa bằng cách sử dụng từ khóa class,  theo sau là tên của lớp.
	 * - Lớp là một bản thiết kế, khuôn mẫu dùng để tạo ra các đối tượng chứa thuộc tính và phương thức.
	 * 
	 * #Cú pháp để định nghĩa 1 lớp:
	 * 
	 * class className {
	 * 		datatype fielName;
	 * }
	 * 
	 * ClassName() {
	 * 		//mã hàm khởi tạo
	 * }
	 * 
	 * *phương thức trả về
	 * returnType methodName(paramenter) {
	 * *kieeurTraVe tenPhuongthuc(thamSo)
	 * 		//Mã thực hiện phương thức
	 * }
	 * 
	 */

	/**
	 * làm thế nào để khai báo biến tham chiếu của 1 đối tượng?
	 * 
	 * - Cần chỉ định kiểu dữ liệu là tên lớp của đối tượng đó. Biến tham chiếu này không lưu trữ bản thân đối tượng
	 * 	mà chỉ lưu trữ địa chỉ tham chiếu đến đói tượng trong bộ nhớ.
	 * 
	 * #Cú pháp khai báo biến tham chiếu:
	 *  className variableName;
	 * 
	 */
	
	/**
	 * Cách tạo ra một đối tượng:
	 * sử dụng từ khóa new kết hợp với hàm khởi tạo (constructor) của lớp.
	 * 
	 * Hàm khởi tạo này sẽ khởi tạo đối tượng, thiết lập các thuộc tính của nó. 
	 * Sau khi đối tượng được tạo, bạn có thể gán nó cho một biến tham chiếu.
	 * 
	 * #Cú pháp:
	 * 
	 * ClassName objectName = new ClassName();
	 * 
	 */
}








