package com.binblee;

import com.widgets.SimpleRenderer;

public class RendererSupport {
    public void render(Object object){
        new SimpleRenderer().rendererAsString(object);
    }
}
