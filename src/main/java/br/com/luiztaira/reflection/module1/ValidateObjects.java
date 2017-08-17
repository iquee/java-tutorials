package br.com.luiztaira.reflection.module1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ValidateObjects {

	public static void main(String[] args) throws Exception {
		List<String> emptyAttributes = getEmptyAttributes(new Product("xxx", null, 1900));
		if (!emptyAttributes.isEmpty())
			for (String product : emptyAttributes)
				System.out.println(product);

	}

	public static List<String> getEmptyAttributes(Object obj) throws Exception {

		List<String> list = new ArrayList<>();
		Class<?> clazz = obj.getClass();
		for (Field field : clazz.getFields()) {
			Object value = field.get(obj);
			if (value == null)
				list.add(field.getName());
		}

		return list;
	}
}
