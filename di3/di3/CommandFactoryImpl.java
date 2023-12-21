package di3;

public class CommandFactoryImpl implements CommandFactory {

	@Override
	public Command createCommand(String commandName) {
		// TODO Auto-generated method stub
		Command command = null;
		
		if(commandName.equals("some")) {
			command = new SomeCommand();
		}
		return command;
	}

}
