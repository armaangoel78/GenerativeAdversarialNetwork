package neural_network_manager;

public class Connection {
	private double weight;
	
	public Connection(double weight) {
		this.weight = weight;
	}
	
	
	public double getOutput(double input) {
		return input*weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
