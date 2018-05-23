package iyegoroff.RNTextGradient.Radial;

import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import iyegoroff.RNTextGradient.RNVirtualTextGradientManager;
import iyegoroff.RNTextGradient.RNShadowTextGradient;

@ReactModule(name = RNVirtualRadialTextGradientManager.REACT_CLASS)
public class RNVirtualRadialTextGradientManager extends RNVirtualTextGradientManager<RNVirtualShadowRadialTextGradient> {

  @VisibleForTesting
  public static final String REACT_CLASS = "RNVirtualRadialTextGradient";

  
  public String getName() {
    return REACT_CLASS;
  }

  
  public RNVirtualShadowRadialTextGradient createShadowNodeInstance() {
    return new RNVirtualShadowRadialTextGradient();
  }

  
  public Class<? extends RNVirtualShadowRadialTextGradient> getShadowNodeClass() {
    return RNVirtualShadowRadialTextGradient.class;
  }
}
