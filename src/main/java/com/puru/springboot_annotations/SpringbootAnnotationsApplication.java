package com.puru.springboot_annotations;

import com.puru.springboot_annotations.controller.MyController;
import com.puru.springboot_annotations.controller.PizzaController;
import com.puru.springboot_annotations.lazy.LazyLoader;
import com.puru.springboot_annotations.repository.MyRepository;
import com.puru.springboot_annotations.scope.PrototypeBean;
import com.puru.springboot_annotations.scope.SingletonBean;
import com.puru.springboot_annotations.service.MyService;
import com.puru.springboot_annotations.service.NonVegPizza;
import com.puru.springboot_annotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootAnnotationsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootAnnotationsApplication.class, args);
		//PizzaController pizzaController = applicationContext.getBean(PizzaController.class);
		//PizzaController pizzaController = (PizzaController) applicationContext.getBean("pizzaController");
		//System.out.println(pizzaController.getPizza());

		/*VegPizza vegPizza = (VegPizza) applicationContext.getBean("vegPizza");
		System.out.println(vegPizza.getPizza());
		 */

		/*NonVegPizza nonVegPizza = (NonVegPizza) applicationContext.getBean("nonVegPizza");
		System.out.println(nonVegPizza.getPizza());*/

		/*MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.hello());

		MyService myService = applicationContext.getBean(MyService.class);
		System.out.println(myService.hello());

		MyRepository myRepository = applicationContext.getBean(MyRepository.class);
		System.out.println(myRepository.hello());*/

		//applicationContext.getBean(LazyLoader.class);

		SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());
		SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());
		SingletonBean singletonBean3 = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean3.hashCode());

		PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());
		PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());
		PrototypeBean prototypeBean3 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean3.hashCode());


	}

}
