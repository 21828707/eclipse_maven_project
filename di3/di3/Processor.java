package di3;

public abstract class Processor {
	public void process(String commandName) {
		CommandFactory factory = getCommandFactory();
		
		Command command = factory.createCommand(commandName);
		command.execute();
	}
	
	protected abstract CommandFactory getCommandFactory();
}
