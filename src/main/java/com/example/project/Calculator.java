/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class Calculator {

	public static int score(int l,boolean h) throws IllegalArgumentException {
		int s = 0;
		if(l<1 || l >5){
			throw new IllegalArgumentException("Invalid input");
		}
		else{
			int[] eBonus = {1000,2000,4000,6500,8500};
			int[] hBonus = {1500,3000,5500,8000,10000};
			while(l>=1){
				if(h == true){
					s+=l*hBonus[l-1];
				}else{
					s+=l*eBonus[l-1];
				}
				l--;
			}
		}
		return s;
	}

}
