package edu.iis.powp.command;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Factory {

	public static PlotterCommand drawRectangle(int x, int y, int w, int h) {
		List<PlotterCommand> commands = new ArrayList<>();

		commands.add(new CommandSetPosition(x, y));
		commands.add(new CommandDrawLineToPosition(x + w, y));
		commands.add(new CommandDrawLineToPosition(x + w, y + h));
		commands.add(new CommandDrawLineToPosition(x, y + h));
		commands.add(new CommandDrawLineToPosition(x, y));

		return new ComplexCommand(commands);
	}

	public static PlotterCommand drawCircle(int x, int y, int r) {
		List<PlotterCommand> commands = new ArrayList<>();

		commands.add(new CommandSetPosition(x,y + r));
		for(double i = 0; i < 2 * Math.PI; i+=0.001) {
			commands.add(new CommandDrawLineToPosition((int)(r * Math.cos(i) + x), (int)(r * Math.sin(i) + y)));
		}
		return new ComplexCommand(commands);
	}

}