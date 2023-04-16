package fr.emile.fil.events;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

import fr.emile.fil.entity.BaseFrame;

public class ThereAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private BaseFrame baseFrame;


	public ThereAction(BaseFrame baseFrame,String name) {
		super(name);
		this.baseFrame = baseFrame;
	}

	public ThereAction(BaseFrame baseFrame,String name, Icon icon) {
		super(name, icon);
		this.baseFrame = baseFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.baseFrame.getTextFieldCopi().setText(
						this.baseFrame.getTextFieldOriginal()
						.getText()
				);

	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
