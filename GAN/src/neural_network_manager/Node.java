package neural_network_manager;

public class Node {
	private double bias;
	
	public Node (double bias) {
		this.bias = bias;
	}
	
	public double getOutput(double[] input) {
		double sum = bias;
		for (double value : input) {
			sum += value;
		}
		
		return activationFunction(sum);
	}
	
	public double activationFunction(double input) {
		return 0;
	}
	
	public double getBias () {
		return bias;
	}
	
	public void setBias(double bias) {
		this.bias = bias;
	}

}
