package servicepublisher;

public class ServicePublishImpl implements ServicePublish {

	@Override
	public double gram2Kilogram(double gram) {
		return gram / 1000.0;
	}

	@Override
	public double kilogram2Gram(double kilogram) {
		return kilogram * 1000;
	}

	@Override
	public double gram2Miligram(double gram) {
		return gram * 1000;
	}

	@Override
	public double meter2Centimeter(double meter) {

		return meter * 100;
	}

	@Override
	public double centimeter2Meter(double centimeter) {
		return centimeter / 100;
	}

	@Override
	public double meter2Kilometer(double meter) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double celcius2Fahrenheit(double celcius) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double fahrenheit2Celcius(double fahrenheit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double kelvin2Celcius(double kelvin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String publishService() {
		// TODO Auto-generated method stub
		return null;
	}

}
