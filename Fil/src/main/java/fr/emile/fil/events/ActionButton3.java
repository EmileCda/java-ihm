package fr.emile.fil.events;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.emile.fil.control.ComboBoxFrame;
import fr.emile.fil.entity.BaseFrame;

public class ActionButton3 extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private ComboBoxFrame comboxFrame;

	// ------------------------ constructor --------------
	public ActionButton3(ComboBoxFrame comboxFrame, String name) {
		super(name);
		this.setComboxFrame(comboxFrame);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object value = this.comboxFrame.getMyCombo1().getSelectedItem();
		if (value.equals("Poire"))
			System.out.println(value);
		else
			System.out.println("pas bin "+ value);

	}

	public ComboBoxFrame getComboxFrame() {
		return comboxFrame;
	}

	public void setComboxFrame(ComboBoxFrame comboxFrame) {
		this.comboxFrame = comboxFrame;
	}

}
