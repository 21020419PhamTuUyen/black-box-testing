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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {
	@Test
	public void testScore1() throws Exception {
		try {
			int output = Calculator.score(1,true);
			assertEquals(1500, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore2() throws Exception {
		try {
			int output = Calculator.score(5,true);
			assertEquals(106000, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore3() throws Exception {
		try {
			int output = Calculator.score(2,true);
			assertEquals(7500, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore4() throws Exception {
		try {
			int output = Calculator.score(4,true);
			assertEquals(56000, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore5() throws Exception {
		try {
			int output = Calculator.score(3,true);
			assertEquals(24000, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore6() throws Exception {
		try {
			int output = Calculator.score(0,true);
			fail("Không ném ngoại lệ");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Invalid");
		}
	}
	@Test
	public void testScore7() throws Exception {
		try {
			int output = Calculator.score(6,true);
			fail("Không ném ngoại lệ");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Invalid");
		}
	}
	@Test
	public void testScore8() throws Exception {
		try {
			int output = Calculator.score(1,false);
			assertEquals(1000, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore9() throws Exception {
		try {
			int output = Calculator.score(5,false);
			assertEquals(85500, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore10() throws Exception {
		try {
			int output = Calculator.score(2,false);
			assertEquals(5000, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore11() throws Exception {
		try {
			int output = Calculator.score(4,false);
			assertEquals(43000, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore12() throws Exception {
		try {
			int output = Calculator.score(3,false);
			assertEquals(17000, output, 0.0);
		} catch (Exception e) {
			fail("Bắt ngoại lệ không đúng");
		}
	}
	@Test
	public void testScore13() throws Exception {
		try {
			int output = Calculator.score(0,false);
			fail("Không ném ngoại lệ");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Invalid");
		}
	}
	@Test
	public void testScore14() throws Exception {
		try {
			int output = Calculator.score(6,true);
			fail("Không ném ngoại lệ");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Invalid");
		}
	}

}
