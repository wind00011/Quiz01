package Java111Q1;

import Java111Q1.Cal_area;

class Cal_area {
	int length;
	int width;
	int height;
	int radius;

	void showData1() {
		System.out.println("�� = " + length);
		System.out.println("�e = " + width);
		System.out.println("�� = " + height);
	}

	void showData2() {
		System.out.println("�b�| =" + radius);
	}

	void surfaceArea() {
		System.out.println("�ߤ�����n = " + ((length * width + length * height + height * width) * 2));
	}

	void volume() {
		System.out.printf("�y����n = " + "%.1f", ((double) 3.14159 * radius * radius * radius * 4 / 3));
		System.out.println();
	}

	void showAll() {
		showData2();
		volume();
		showData1();
		surfaceArea();
	}

}

public class Class01 {

	public static void main(String args[]) {
		Cal_area area = new Cal_area();
		area.length = 4;
		area.width = 5;
		area.height = 6;
		area.radius = 10;
		area.showAll();
	}

}

