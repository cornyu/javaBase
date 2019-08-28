package base.annotation;

import java.lang.reflect.Field;


public class AnnotationTest {

	public static void main(String[] args) {
		
       getFruitInfo("com.ff.base.annotation.Apple");
       
	}

	public static void getFruitInfo(String clas)
	{
		try {
			Class<?> cls = Class.forName(clas);
			Field[] fields = cls.getDeclaredFields();
			for(Field field:fields)
			{
				if(field.isAnnotationPresent(FruitName.class))
				{
					FruitName fruitName = field.getAnnotation(FruitName.class);
					System.out.println("field name:"+fruitName);
				}
				if(field.isAnnotationPresent(FruitColor.class))
				{
					FruitColor color = field.getAnnotation(FruitColor.class);
					System.out.println("Fruit color :" + color);
				}
				if(field.isAnnotationPresent(FruitProvider.class))
				{
					 FruitProvider Provider = field.getAnnotation(FruitProvider.class);
					 System.out.println("Fruit FruitProvider: ProviderID:"+Provider.id()+" Provider:"+Provider.user() +" ProviderAddress:"+Provider.address());	
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
