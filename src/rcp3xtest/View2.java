package rcp3xtest;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;

public class View2 extends ViewPart {
	public static final String ID = "rcp3xTest.View2";
	
	@Inject IWorkbench workbench;
	Text text;
	Text text2;
	 @Override
	    public void createPartControl(Composite parent) {
	        text = new Text(parent, SWT.BORDER);
	        text.setText("Imagine a fantastic user interface here");
	        text2 = new Text(parent, SWT.BORDER);
	        text2.setText("\nDon't Imagine a fantastic user interface here");
	    }

	    @Override
	    public void setFocus() {
	    	text2.setFocus();
	    }
}