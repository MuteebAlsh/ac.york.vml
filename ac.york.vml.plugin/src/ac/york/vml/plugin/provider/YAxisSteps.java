package ac.york.vml.plugin.provider;

public class YAxisSteps {

	private double steps;
	
	public  YAxisSteps() {
		
	}
	
	public Double getStepsValue(double dataElement) {
		steps = dataElement;
		return steps;
	}
}
