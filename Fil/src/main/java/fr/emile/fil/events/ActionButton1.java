package fr.emile.fil.events;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.emile.fil.control.ComboBoxFrame;
import fr.emile.fil.entity.BaseFrame;

public class ActionButton1 extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private ComboBoxFrame comboxFrame;
	//------------------------ constructor --------------
	public ActionButton1(ComboBoxFrame comboxFrame,String name) {
		super(name);
		this.setComboxFrame(comboxFrame);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String text = this.comboxFrame.getTextFieldCopi().getText();
	
		this.comboxFrame.getMyCombo1().addItem(text);
	}
	public ComboBoxFrame getComboxFrame() {
		return comboxFrame;
	}
	public void setComboxFrame(ComboBoxFrame comboxFrame) {
		this.comboxFrame = comboxFrame;
	}


}
