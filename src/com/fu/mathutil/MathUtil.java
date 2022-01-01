package com.fu.mathutil;

// Ta viết cái Class để cung cấp tiện ích cho nơi khác xài
// Khi ta cung cấp tiện ích nơi khác xài, đó là lúc ta ko cần nhớ cái gì
// cho riêng ta, hàm Static giúp làm điều này
public class MathUtil {
    
    // n! = 1.2.3.4.5.6...n
    // Quy ước: 0! = 1! = 1
    // Ko tính giai thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    // 21! lố kiểu long
    // nếu đưa số âm, 21 giai thừa, ta ko tính, ta đập vào mặt ai xài hàm
    // một cái ngoại lệ, chửi ko tính đc
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 1 to 20");
        // hàm dừng liền ko cần return
        
        // xuống đây là n = 0..20 rồi
        if (n ==0 || n == 1)
            return 1; // dừng ngay khi n đặc biệt
        
        // xuống đến đây n = 2..20 rồi
        // chơi for hoặc đệ quy - rescustion
        // kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        // i = 2, 3, 4, 5, n nhồi liên tục i vào tích
        long product = 1; // tích khởi đầu = 1, nhồi 2 3 4 5 6 7 8 .. n
        for (int i = 2; i <= n; i++) {
            product *= i; // product = product đang có nhân với i, đập ngược lại
            // product = product * i; // nhồi liên tục product
            // nhân từ 2 đến
        }
        return product;
    }
}
