package iyegoroff.RNTextGradient.Linear;

import iyegoroff.RNTextGradient.RNTextGradientManager;
import iyegoroff.RNTextGradient.RNShadowTextGradient;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import android.util.Log;
import com.facebook.react.common.ReactConstants;

@ReactModule(name = RNLinearTextGradientManager.REACT_CLASS)
public class RNLinearTextGradientManager extends RNTextGradientManager {

    @VisibleForTesting
    public static final String REACT_CLASS = "RNLinearTextGradient";

    
    public String getName() {
        return REACT_CLASS;
    }

    
    public RNShadowTextGradient createShadowNodeInstance() {
        return new RNShadowLinearTextGradient();
    }

    
    public Class<? extends RNShadowTextGradient> getShadowNodeClass() {
        return RNShadowLinearTextGradient.class;
    }

}
