package servicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import gui.UnitConvertor;
import servicepublisher.ServicePublish;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		try {
			System.out.println("Start Subsciber start");
			serviceReference = bundleContext.getServiceReference(ServicePublish.class.getName());
			ServicePublish servicePublish = (ServicePublish) bundleContext.getService(serviceReference);
			UnitConvertor window = new UnitConvertor(servicePublish);
			window.frame.setVisible(true);
			
//			while(true) {
//				int x,y;
//				Scanner scan = new Scanner(System.in);
//				System.out.println("Input no 1 : ");
//				x = scan.nextInt();
//				System.out.println("Input no 2 : ");
//				y = scan.nextInt();
//				
//				System.out.println("Answer is "+ servicePublish.add(x, y));
//			}
			
			
		} catch (Exception e) {

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good Bye !!!");
		bundleContext.ungetService(serviceReference);

	}

}
