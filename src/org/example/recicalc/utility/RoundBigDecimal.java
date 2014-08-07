/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.example.recicalc.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Utility Class to roundup to nearest values 
 * @author Preet
 */
public class RoundBigDecimal {
    
    /**
     * Roundup the given value to nearest given increment 
     * @param value
     * @param nearestTo
     * @param roundingMode
     * @return 
     */
    public static BigDecimal round(BigDecimal value, BigDecimal nearestTo, RoundingMode roundingMode) {
                //prevent division by 0
		if (nearestTo.signum() == 0) {
			return value;
		} else {
			BigDecimal divided = value.divide(nearestTo, 0, RoundingMode.UP);
			BigDecimal result = divided.multiply(nearestTo);
			return result;
		}
	}
    /**
     * Roundup given value nearest to given cents 
     * roundup is only to fractional part
     * @param value
     * @param nearestCent
     * @return 
     */
    public static BigDecimal roundUpToNearestCents(BigDecimal value,BigDecimal nearestCent) {

		if (nearestCent.signum() == 0) {
			return value;
		} else {
                        //Extract the fraction part to perform roundup to cents level
			BigDecimal fractionPart = value.subtract(new BigDecimal(value.intValue()));
			BigDecimal mainPart = value.subtract(fractionPart);
			BigDecimal divided = fractionPart.divide(nearestCent, 0, RoundingMode.UP);
			BigDecimal resultFraction = divided.multiply(nearestCent);
			return mainPart.add(resultFraction);
		}
    }
}
