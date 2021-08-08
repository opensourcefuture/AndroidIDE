package com.itsaky.lsp;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class Position {
    
    @SerializedName("line")
    public int line;
    
    @SerializedName("character")
    public int character;

    public Position() {}

    public Position(int line, int character) {
        this.line = line;
        this.character = character;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Position) {
            Position that = (Position) obj;
            return this.line == that.line
            && this.character == that.character;
        }
        return false;
    }
    
    public static final Position NONE = new Position(-1, -1);
}