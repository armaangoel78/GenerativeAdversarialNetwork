package neural_network_manager;

public class Network {
	Layer layers[];
	
	public Network(int size) {
		layers = new Layer[size];
		for (Layer layer : layers) {
			layer = new Layer(0,0);
		}
	}
	
	public double getOutput(double input) {
		return 0;
	}
}
