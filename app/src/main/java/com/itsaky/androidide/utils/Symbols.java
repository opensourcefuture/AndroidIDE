package com.itsaky.androidide.utils;

import com.itsaky.androidide.fragments.EditorFragment;
import com.itsaky.androidide.views.SymbolInputView.Symbol;
import java.io.File;

public class Symbols {
	
	public static Symbol[] forFile(File file) {
		if(file.isFile()) {
			if(file.getName().endsWith(EditorFragment.EXT_JAVA)
			|| file.getName().endsWith(EditorFragment.EXT_GRADLE))
				return javaSymbols();
			
			if(file.getName().endsWith(EditorFragment.EXT_XML))
				return xmlSymbols();
		}
		
		return new Symbol[0];
	}
    
    public static Symbol[] javaSymbols() {
		return new Symbol[]{new Symbol("->", "\t"),
			new Symbol("{", "{}"),
			new Symbol("}"),
			new Symbol("(", "()"),
			new Symbol(")"),
			new Symbol(";"),
			new Symbol("="),
			new Symbol("\"", "\"\""),
			new Symbol("|"),
			new Symbol("&"),
			new Symbol("!"),
			new Symbol("[", "[]"),
			new Symbol("]"),
			new Symbol("<", "<>"),
			new Symbol(">"),
			new Symbol("+"),
			new Symbol("-"),
			new Symbol("/"),
			new Symbol("*"),
			new Symbol("?"),
			new Symbol(":"),
			new Symbol("_")};
	}
	
	public static Symbol[] xmlSymbols() {
		return new Symbol[]{new Symbol("->", "\t"),
			new Symbol("<", "<>"),
			new Symbol(">"),
			new Symbol("/"),
			new Symbol("="),
			new Symbol("\"", "\"\""),
			new Symbol(":"),
			new Symbol("@"),
			new Symbol("+"),
			new Symbol("(", "()"),
			new Symbol(")"),
			new Symbol(";"),
			new Symbol(","),
			new Symbol("."),
			new Symbol("?"),
			new Symbol("|"),
			new Symbol("\\"),
			new Symbol("&"),
			new Symbol("[", "[]"),
			new Symbol("]"),
			new Symbol("{", "{}"),
			new Symbol("}"),
			new Symbol("_"),
			new Symbol("-")};
	}
    
}