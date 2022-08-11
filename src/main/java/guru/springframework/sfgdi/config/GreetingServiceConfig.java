package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

@EnableConfigurationProperties(SfgContrstuctorConfig.class)
@ImportResource("classpath:sfg-di.xml")
@Configuration
public class GreetingServiceConfig {
	
	@Bean
	FakeDataSource fakeDataSource(SfgContrstuctorConfig sfgContrstuctorConfig){
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(sfgContrstuctorConfig.getUsername());
		fakeDataSource.setPassword(sfgContrstuctorConfig.getPassword());
		fakeDataSource.setJdbcurl(sfgContrstuctorConfig.getJdbcurl());

		return fakeDataSource;
	}
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"dog", "default"})
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile("cat")
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}
	
	@Profile({"ES", "default"})
	@Bean("i18nService")
	I18NSpanishGreetingService i18nSpanishService() {
		return new I18NSpanishGreetingService();
	}
	
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Profile("EN")
	@Bean
	I18NEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18NEnglishGreetingService(englishGreetingRepository);
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	//@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyGreetingService propertyGreetingService() {
		return new PropertyGreetingService();
	}
	
	@Bean
	SetterGreetingService setterGreetingService() {
		return new SetterGreetingService();
	}
}
