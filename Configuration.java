package limit_services;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component..not required.
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int minimum;
	private int maximum;

	public void setMinimum(int minimum) {
		this.minimum = minimum;//setters are mandatory for this configuration class.
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

}
