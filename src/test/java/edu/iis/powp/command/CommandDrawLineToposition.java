package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToposition implements PlotterCommand {

	private int x,y;
	
	public CommandDrawLineToposition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute(IPlotter iPlotter) {
		iPlotter.drawTo(x, y);
		
	}
}
