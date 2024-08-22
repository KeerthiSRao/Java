package com.xworkz.save;

import com.xworkz.data.SandalData;

public class SandalDataSave {

	SandalData[] datas = new SandalData[5];
	private int index;

	public void save(SandalData sandals) {
		System.out.println("Saved data");
		this.datas[this.index]=sandals;
		index++;
	}

	public void display() {
		for (SandalData data : datas) {
			if (data != null) {
				data.mudrana();
			} else {
				System.out.println("Data is null");
			}
		}
	}

}

