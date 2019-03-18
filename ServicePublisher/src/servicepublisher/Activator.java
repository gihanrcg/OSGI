package servicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
	try {
		System.out.println("Publisher start");
		ServicePublish publisherService=new ServicePublishImpl();
		publishServiceRegistration=bundleContext.registerService(
				ServicePublish.class.getName(),publisherService,null);
	}catch(Exception e) {
		
	}
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher stop");
		publishServiceRegistration.unregister();
	}

}
