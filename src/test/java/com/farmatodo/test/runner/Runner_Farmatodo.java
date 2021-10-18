package com.farmatodo.test.runner;



	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.SnippetType;
	import net.serenitybdd.cucumber.CucumberWithSerenity;

	@RunWith(CucumberWithSerenity.class)
	

	@CucumberOptions(features="src/test/resources/feature/farmatodo.feature", glue= {"com.farmatodo.test.definitions"}, snippets= SnippetType.CAMELCASE, tags= "@tag1,@tag2,@tag3")
	public class Runner_Farmatodo {
		

	
}
