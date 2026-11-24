// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles")

package mui.material.styles

/**
 * Make every component density-aware on the one shipped scale (`scale`
 * overrides any step). Apply LAST, on the final composed theme — later
 * `createTheme()` wraps rebuild the vars machinery and drop the emitted scale.
 */
external fun <T : Theme> unstable_enhanceDensity(
    theme: T,
    scale: DensityScaleOverrides = definedExternally,
): T
