package fr.emile.fil.events;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.emile.fil.entity.BaseFrame;

public class HereAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private BaseFrame baseFrame;

	// ------------------------ constructor --------------
	public HereAction(BaseFrame baseFrame, String name) {
		super(name);
		this.baseFrame = baseFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.baseFrame.getTextFieldOriginal().setText(this.baseFrame.getTextFieldCopi()

				.getText());

	}

}
