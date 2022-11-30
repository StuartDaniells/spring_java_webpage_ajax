/**
 * @author Stuart Daniells - c0829441
 * @date 27th November
 * Assignment 4
 * PageCounter data class
 */

package ca.lambton.Stuart_c0829441_A4;

import lombok.Data;

@Data
public class PageCounter {
	private Integer pageCount = 0;
	
	public void incrementPageCount() {
		pageCount += 1; 
	}
	
	public Integer getPageCount() {
		return pageCount;
	}
}
