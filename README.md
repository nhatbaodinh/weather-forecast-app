# Weather Forecast Application

Ứng dụng dự báo thời tiết giúp người dùng tìm kiếm thông tin thời tiết cho một thành phố cụ thể, bao gồm nhiệt độ, độ ẩm, áp suất, tốc độ gió và mô tả thời tiết. Ứng dụng cũng cung cấp dự báo thời tiết trong ba ngày tới và hỗ trợ chế độ sáng/tối.

## Mô Tả

Ứng dụng này cho phép người dùng:
- Nhập tên thành phố để tra cứu thông tin thời tiết.
- Hiển thị thông tin thời tiết hiện tại như nhiệt độ, độ ẩm, áp suất và tốc độ gió.
- Dự báo thời tiết trong ba ngày tới.
- Chuyển đổi giữa chế độ sáng và tối.

## Công Nghệ Sử Dụng

- **Java**: Ngôn ngữ lập trình chính.
- **JavaFX**: Dùng để xây dựng giao diện người dùng (GUI).
- **OpenWeatherMap API**: Lấy dữ liệu thời tiết từ Internet.
- **FXML**: Định dạng XML để xây dựng giao diện người dùng.
- **CSS**: Tùy chỉnh giao diện với chế độ sáng/tối.

## Cài Đặt

Để chạy ứng dụng, bạn cần:
1. **JDK 17** hoặc phiên bản mới hơn.
2. **Maven** hoặc **Gradle** (tuỳ chọn, nếu sử dụng quản lý phụ thuộc).
3. **API Key** từ OpenWeatherMap (để lấy dữ liệu thời tiết).

### Bước 1: Cài Đặt Java
Cài đặt JDK 17 trở lên từ [trang chủ Oracle](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) hoặc sử dụng **OpenJDK**.

### Bước 2: Cài Đặt Maven (Tuỳ Chọn)
Nếu bạn muốn sử dụng Maven để quản lý các phụ thuộc, hãy cài đặt Maven từ [trang chính của Maven](https://maven.apache.org/download.cgi).

### Bước 3: Lấy API Key từ OpenWeatherMap
Đăng ký và lấy **API Key** từ [OpenWeatherMap](https://openweathermap.org/api). Bạn cần API Key này để truy xuất dữ liệu thời tiết.

### Bước 4: Cấu Hình API Key
Trong mã nguồn, tìm và thay thế giá trị API Key trong mã:

```java
String apiKey = "YOUR_API_KEY";
```

### Bước 5: Chạy Ứng Dụng
Sử dụng Maven để chạy ứng dụng:

```bash
mvn spring-boot:run
```
