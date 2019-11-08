package currency.converter;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exchange-service", url="localhost:8000")//same as below two annotations.
//@FeignClient(name="currency-exchange-service")//this name is artifact id of pom.xml.here zuul  is not called before executing currencyexcahnge service.
@FeignClient(name="netflix-zuul-api-gateway-server")//now connecting currencyconverter class to zuul api.first zuul is called and then currency-exchange will be called after that.
@RibbonClient(name="currency-exchange-service")//using ribbon and feign.now using ribbon we can talk to multiple instance of microservive(currencyexchangeservice).here instance means port number which is 8000 and 8100 of currencyexchange.
public interface CurrencyExchangeServiceProxy {
	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")//mapping currency exchange uri
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")//mapping Zuul uri of currencyexchange service.
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
