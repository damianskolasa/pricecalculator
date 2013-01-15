package pl.pricecalculator;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import pl.pricecalculator.model.PriceClientInformation;
import pl.pricecalculator.ws.PriceCalculatorWebService;

public class PriceCalculatorWSTest {

	public static void main(String[] args) throws Exception {
		URL url = new URL(
				"http://localhost:8081/pricecalculator/PriceCalculatorWebServiceImpl?wsdl");

		QName qname = new QName("http://ws.pricecalculator.wojcik.kolasa/",
				"PriceCalculatorWebService");

		Service service = Service.create(url, qname);

		PriceCalculatorWebService priceCalculator = service
				.getPort(PriceCalculatorWebService.class);

		System.out.println(priceCalculator.calculatePrice("afas", new PriceClientInformation()));
	}
}
