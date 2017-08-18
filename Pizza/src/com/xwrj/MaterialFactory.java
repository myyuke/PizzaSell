package com.xwrj;

public class MaterialFactory {
	private static MaterialFactory materialFactory;

	public static MaterialFactory createMaterialFactory() {
		if (materialFactory == null) {
			materialFactory = new MaterialFactory();
		}
		return materialFactory;
	}

	public static String getDoughMaterial(String city, String type) {
		return city+" fengwei "+type+" pizza dough";
	}

	public static String getSauceMaterial(String city, String type) {
		return city+" fengwei "+type+" pizza sauce";
	}

}
