/**
 * The starter class. Clean, simple and short, as all starter classes should be.
 * 
 * @author surber
 *
 */
public class Starter {
  public static void main(String[] args) {
    Simulation sim = new Simulation(453, true, Preset.Penta);
    SimulationPanel simPanel = new SimulationPanel(sim, 40, .6);
    simPanel.getSimulation().start();
  }
}