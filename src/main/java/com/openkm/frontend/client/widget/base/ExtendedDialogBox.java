/**
 * OpenKM, Open Document Management System (http://www.openkm.com)
 * Copyright (c) Paco Avila & Josep Llort
 * <p>
 * No bytes were intentionally harmed during the development of this application.
 * <p>
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.openkm.frontend.client.widget.base;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Visibility;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.DialogBox;
import com.openkm.frontend.client.util.CommonUI;

/**
 * ExtendedDialogBox
 */
public class ExtendedDialogBox extends DialogBox {
	/**
	 * ExtendedDialogBox
	 */
	public ExtendedDialogBox() {
		super();
	}

	/**
	 * ExtendedDialogBox
	 */
	public ExtendedDialogBox(boolean autoHide) {
		super(autoHide);
	}

	/**
	 * ExtendedDialogBox
	 */
	public ExtendedDialogBox(Caption captionWidget) {
		super(captionWidget);
	}

	/**
	 * ExtendedDialogBox
	 */
	public ExtendedDialogBox(boolean autoHide, boolean modal) {
		super(autoHide, modal);
	}


	/**
	 * ExtendedDialogBox
	 */
	public ExtendedDialogBox(boolean autoHide, boolean modal, Caption captionWidget) {
		super(autoHide, modal, captionWidget);
	}

	/**
	 * enableBackgroundGrayEffect
	 */
	public void enableBackgroundGrayEffect() {
		this.getElement().getStyle().setZIndex(2000);
		this.addAttachHandler(new AttachEvent.Handler() {
			@Override
			public void onAttachOrDetach(AttachEvent event) {
				if (event.isAttached()) {
					CommonUI.showBackgrounGrayEffect();
				} else {
					CommonUI.hideBackgrounGrayEffect();
				}
			}
		});
	}

	/**
	 * hideCaption
	 */
	public void hideCaption() {
		Element element = DOM.getChild(DOM.getChild(DOM.getChild(DOM.getChild(getElement(), 0), 0), 0), 0);
		element.getStyle().setVisibility(Visibility.HIDDEN);
		element.getStyle().setDisplay(Display.NONE);
	}

	/**
	 * showCaption
	 */
	public void showCaption() {
		Element element = DOM.getChild(DOM.getChild(DOM.getChild(DOM.getChild(getElement(), 0), 0), 0), 0);
		element.getStyle().setVisibility(Visibility.VISIBLE);
		element.getStyle().setDisplay(Display.INLINE);
	}
}
