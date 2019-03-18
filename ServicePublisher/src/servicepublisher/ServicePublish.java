package servicepublisher;

import conversions.lengthConversions;
import conversions.tempratureConversions;
import conversions.weightConversions;

public interface ServicePublish extends weightConversions,lengthConversions,tempratureConversions {

	public String publishService();	

}
