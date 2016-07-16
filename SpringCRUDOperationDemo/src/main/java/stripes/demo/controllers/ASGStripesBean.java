package stripes.demo.controllers;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public class ASGStripesBean implements ActionBean {
	private ASGActionBeanContext actionBeanContext;

	@Override
	public void setContext(ActionBeanContext context) {
		actionBeanContext = (ASGActionBeanContext) context;

	}

	@Override
	public ASGActionBeanContext getContext() {

		return actionBeanContext;
	}
}
