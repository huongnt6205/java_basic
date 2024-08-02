package test;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello \n");

		System.out.println("Các quy tắc đặt tên: \n" + "1. chữ cái đầu tiên mỗi phần tử phải viết hoa. \n"
				+ "2. không có dấu cách, dấu gạch dưới, gạch ngang giữa các từ \n"
				+ "3. không dùng kí tự đặc biệt hoặc số ở đầu \n"
				+ "4. đảm bảo có nghĩa, dễ hiểu, nhất quán trong toàn bộ project. \n"
				+ "5. tên hàm, biến, phương thức theo kiểu camelCase \n");

		System.out.println("JRE System Library là chứa toàn bộ thư viện để biên dịch và chạy chương trình java");
		
		
		/**
		 * cd: truy vấn thay đoiỉ thư mục làm việc
		 * dir: liệt kê tập tin thư mục bên trong
		 * clear: xóa những dòng lệnh du thừa, làm gọn code
		 * mkdir: tạo thư mục mới
		 * touch: tạo tập tin mới
		 * echo: in xuất nội dung, tạo nội dung - file mới.
		 * cat: hiển htij nội dung
		 * rm: xóa tập tin (
		 * 			rm -d : xóa thư mục rỗng derectory\
		 * 			rm -r : xóa thư mục derectory không rỗng 
		 * )
		 */
		
		/**
		 * repository: kho lưu trữ
		 * commit: 1 đơn vị làm việc để đưa thông tin file và repo
		 * branch: Nhánh
		 * main/master: tên của main repo
		 * merge/rebase: kết hợp 2  nhánh
		 */
		
		/**
		 * git --help: trợ giúp,hướng dẫn 
		 * git --version: hiển thị thông tin phiên bản git
		 * git status: hiển thị trạng thái kho lưu trữ
		 * git log: hiển thị lịch sử commit
		 */
		
		/**
		 * câu lệnh cấu hình dư án git
		 * git init [repo name]: tạo ra kho lưu trống.
		 * git clone [repo name] [clone name]: tạo 1 bản sao được liên kết với kho lưu trữ 
		 * git config -l: xem cấu hình hiện tại.
		 * git config -l [--scope] [option.name] [value]: 
		 * 		scope: --system: ảnh hưởng toàn bộ người dùng
		 * 			   --global: ảnh hưởng đến n` repo
		 * 			   --vocal:  ảnh hưởng đến 1 repo
		 */
		
		/**
		 * Trạng thái của git: 
		 * git add: đưa file đến khu vuwjxc tổ chức index
		 * 		git add [file name (s)] : thêm 1 or n` file vào index
		 * 		git add . 				: thêm  all  ''     ''
		 * git commit -m "nội dung" : tạo commit(ghi chú) khi thêm vào  
		 * git status: so sánh sự khác biệt giữa 3 cây
		 * git diff: so sánh commit cuối
		 * git log: xem lịch sử
		 */
		
		/**
		 * Cấu hình .gitignore :  chỉ định tệp, thư mục không nên theo dõi bởi git.(bỏ qua file, thư mục)
		 * 
		 * Bao gồm: log, thư mục, thumb.db,... : 
		 * *.log : bỏ qua tất cả file log
		 * vd thư mục tên mode1 cách bỏ qua là: mode1/
		 * vd tên file read.txt
		 * 
		 */
		
		/**
		 * git init --base: tạo 1 central repo
		 * git conle [repo.name] [clone.name] : sap chép và liên kết repo.name
		 * git fetch: lấy thông tin về commit mới từ central(cập nhật thông tin)
		 * git pull: lấy dữ liệu từ cantral về local repo
		 * git push: đẩy các commit từ lacal về central
		 */
	}
	
}
