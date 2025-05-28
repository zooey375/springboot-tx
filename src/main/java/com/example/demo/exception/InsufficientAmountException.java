// 自訂例外，加入後如果遇到餘額不足，sql 資料庫就不會自動扣價錢!
//(原本如果我們遇到餘額不足時，會顯示餘額不足，不會扣錢但會扣資料庫中的庫存)

package com.example.demo.exception;

// 餘額/庫存不足
public class InsufficientAmountException extends Exception {
	public InsufficientAmountException(String message) {
		super(message);
	}
}