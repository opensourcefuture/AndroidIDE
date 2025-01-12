/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.itsaky.layoutinflater.adapters.android.widget;

import android.view.View;
import android.widget.CheckedTextView;
import com.itsaky.layoutinflater.IResourceFinder;
import com.itsaky.layoutinflater.IAttribute;

/**
 * Attribute handler for handling attributes related to
 * CheckedTextView.
 *
 * @author Akash Yadav
 */
public class CheckedTextViewAttrAdapter extends TextViewAttrAdapter {

    @Override
    public boolean isApplicableTo(View view) {
        return view instanceof CheckedTextView;
    }

    @Override
    public boolean apply(IAttribute attribute, View view) {
        
        final CheckedTextView text = (CheckedTextView) view;
        final String namespace = attribute.getNamespace();
        final String name = attribute.getAttributeName();
        final String value = attribute.getValue();
        
        if (!canHandleNamespace(namespace)) {
            return false;
        }
        
        boolean handled = true;
        
        switch (name) {
            case "checkMarkTintMode" :
                text.setCheckMarkTintMode(parsePorterDuffMode(value));
                break;
            case "checkMarkTint" :
                // TODO Parse color state list
                break;
            case "checkMark" :
                // Ignored...
                break;
            default :
                handled = false;
                break;
        }
        
        if (!handled) {
            handled = super.apply(attribute, view);
        }

        return handled;
    }
}
