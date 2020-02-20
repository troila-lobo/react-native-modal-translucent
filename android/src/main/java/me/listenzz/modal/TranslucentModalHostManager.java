package me.listenzz.modal;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.modal.ReactModalHostView;

@ReactModule(name = TranslucentModalHostManager.REACT_CLASS)
public class TranslucentModalHostManager extends ReactModalHostManager {
    protected static final String REACT_CLASS = "TranslucentModalHostView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ReactModalHostView createViewInstance(ThemedReactContext reactContext) {
        return new TranslucentModalHostView(reactContext);
    }

    @Override
    public LayoutShadowNode createShadowNodeInstance() {
        return new TranslucentModalHostShadowNode();
    }

    @Override
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return TranslucentModalHostShadowNode.class;
    }
}
