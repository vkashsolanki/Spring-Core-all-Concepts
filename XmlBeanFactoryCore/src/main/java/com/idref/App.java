package com.idref;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)

	{

		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		// Resource resource = new ClassPathResource(beanFactory);
		reader.loadBeanDefinitions("com/idref/Comfiguration.xml");
		beanFactory.getBean("emp");

	}
}