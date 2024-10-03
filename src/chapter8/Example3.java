package chapter8;

public class Example3 {

	/**
	 * Sự khác biệt giữa các hàm tạo và phương thức là gì?
	 * 
	 * -Tên lớp:
	 * 		+ Constructor phải có tên giống hệt với tên lớp
	 * 		+ Method phải có thể có tên bất kì, miễn là không trùng với
	 * 		  các phương thức khác trong cùng lớp.
	 * - Kiểu trả về:
	 * 		+ Constructor khong có kiểu trả về, không cần khai báo kiểu trả về,
	 * 		  thậm chí không hải "void".
	 * 		+ method phải có kiểu trả về.
	 * - Mục đích sử dụng:
	 * 		+ Constructor được sd để khởi tạo đối tượng khi sd toán tử "new".
	 * 		  Nó giúp gán giá trị đầu cho các thuộc tính của đối tượng.
	 * 		+ Method sd để thực hiện các hành vi hoặc tính toán sau khi đối tượng đã 
	 * 		  được khởi tạo.
	 * - Cách gọi: 
	 * 		+ Constructor được gọi ngầm khi đối tượng đc khởi tạo bằng từ khóa "new".
	 *  	+ Method phải được gọi rõ ràng thông qua đối tượng hoặc tên lớp.
	 * 
	 * - Nạp chồng:
	 * 		+ Constructor có thể được nạp chồng, có nghĩa là một lớp có thể có nhiều 
	 * 		  hàm tạo với các tham số khác nhau.
	 * 		+ Method cũng có thể được nạp chồng, nhwg mỗi phương thức nạp chồng phải có 
	 * 		  chữ ký phương thức khác nhau.
	 * - Mặc định: 
	 *		+ Constructor mặc định(không tham số) sẽ được tự đông thêm 
	 */
	
	/**
	 * Một lớp có hàm tạo mặc định khi: không có bất kỳ Constructor nào được định nghĩa rõ ràng
	 * trong lớp này: 
	 * 
	 * 	
	 */
}
