package rcp3xtest;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {
	 
	
	public static final String ID = "rcp3xtest.Perspective";
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		
		layout.setFixed(true);
		
		layout.addStandaloneView(NavigationView.ID,  true,
				IPageLayout.LEFT, 0.25f, editorArea);
		
		IFolderLayout folder = layout.createFolder("messages",
				IPageLayout.TOP, 0.5f, editorArea);
		
		folder.addPlaceholder(View2.ID + ":*");
		folder.addView(View2.ID);
		
		layout.getViewLayout(NavigationView.ID).setCloseable(false);
	}
}
