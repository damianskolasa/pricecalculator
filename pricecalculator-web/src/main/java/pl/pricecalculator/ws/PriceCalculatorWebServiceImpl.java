package pl.pricecalculator.ws;

import javax.jws.WebService;

import pl.pricecalculator.model.PriceClientInformation;

@WebService(name = "PriceCalculatorWebService", endpointInterface = "pl.pricecalculator.ws.PriceCalculatorWebService")
public class PriceCalculatorWebServiceImpl implements PriceCalculatorWebService {
	
	public Double calculatePrice(String productCode, PriceClientInformation priceClientInformation) {
		return 125.0;
	}

}
