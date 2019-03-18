package servicepublisher;

public class ServicePublishImpl implements ServicePublish{

	@Override
	public String publishService() {
		return "Execute the publish service of the ServicePublisher"; 
	}

	@Override
	public int add(int a, int b) {		
		return a + b;
	}

	@Override
	public double convertGramToKilogram(double gram) {			
			return gram / 1000.0;
	}
	
	

}
