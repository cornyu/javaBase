package base.annotation;

import base.annotation.FruitColor.Color;

public class Apple {

	@FruitName(value = "yujy Apple")
	private String fruitName;

	@FruitColor(fruitColor = Color.RED)
	private String fruitColor;

	@FruitProvider(id = 1, user = "Tom", address = "China")
	private FruitProvider provider;

}
