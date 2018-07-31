package com.example.demo.controllers;

public class Options {

	public static final int Opt_1 = 1;
	public static final int Opt_2 = 2;
	public static final int Opt_3 = 4;
	public static final int Opt_4 = 8;

	private boolean option_1;
	private boolean option_2;
	private boolean option_3;
	private boolean option_4;

	public boolean isOption_1() {
		return option_1;
	}

	public void setOption_1(boolean option_1) {
		this.option_1 = option_1;
	}

	public boolean isOption_2() {
		return option_2;
	}

	public void setOption_2(boolean option_2) {
		this.option_2 = option_2;
	}

	public boolean isOption_3() {
		return option_3;
	}

	public void setOption_3(boolean option_3) {
		this.option_3 = option_3;
	}

	public boolean isOption_4() {
		return option_4;
	}

	public void setOption_4(boolean option_4) {
		this.option_4 = option_4;
	}

	public byte getAllOption() {
		byte Value = 0;
		if (option_1)
			Value |= (byte) Opt_1;
		if (option_2)
			Value |= (byte) Opt_2;
		if (option_3)
			Value |= (byte) Opt_3;
		if (option_4)
			Value |= (byte) Opt_4;
		return Value;
	}

	public void setAllOption(byte value) {
		option_1 = ((value & (byte) Opt_1) != 0);
		option_2 = ((value & (byte) Opt_2) != 0);
		option_3 = ((value & (byte) Opt_3) != 0);
		option_4 = ((value & (byte) Opt_4) != 0);
	}

}
