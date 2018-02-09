package neural_network_manager;

public class Layer {
	Node nodes[];
	Connection connections[][];
	
	public Layer(int nodes, int next_nodes) {
		this.nodes = new Node[nodes];
		
		for (Node node : this.nodes) {
			node = new Node(0);
		}
		
		connections = new Connection[next_nodes][nodes];
		
		for (Connection connections[] : connections) {
			for (Connection connection: connections) {
				connection = new Connection(0);
			}
		}
	}
	
	public double[][] getOutput(double input[][]) {
		double nodesOut[] = new double[nodes.length];
		for (int i = 0; i < nodesOut.length; i++) {
			nodesOut[i] = nodes[i].getOutput(input[i]);
		}
		
		double output[][] = new double[connections.length][connections[0].length];
		for (int i = 0; i < output.length; i++) {
			for (int x = 0; x < output[i].length; x++) {
				output[i][x] = connections[i][x].getOutput(nodesOut[x]);
			}
		}
		
		return output;
	}
}
