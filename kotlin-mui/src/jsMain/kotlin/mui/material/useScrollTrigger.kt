@file:JsModule("@mui/material/useScrollTrigger")
@file:JsNonModule

package mui.material

@JsName("default")
external fun useScrollTrigger(options: ScrollTriggerOptions = definedExternally): Boolean

external interface ScrollTriggerOptions {
    /** Defaults to false. Disable the hysteresis. Ignore the scroll direction when determining the trigger value. */
    var disableHysteresis: Boolean
    /** Defaults to window. */
    var target: dynamic
    /** Defaults to 100. Change the trigger value when the vertical scroll strictly crosses this threshold (exclusive). */
    var threshold: Number
}
