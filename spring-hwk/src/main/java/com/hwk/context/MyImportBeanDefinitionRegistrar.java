package com.hwk.context;

import com.hwk.dao.UserDao;
import com.hwk.factorybean.MyFactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(UserDao.class);
		GenericBeanDefinition bd = (GenericBeanDefinition) builder.getBeanDefinition();
		bd.getConstructorArgumentValues().addGenericArgumentValue("com.hwk.dao.UserDao");
		bd.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("userDao",bd);

	}
}
