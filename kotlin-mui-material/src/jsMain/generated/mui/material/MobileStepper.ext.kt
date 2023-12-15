// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface MobileStepperVariant {
    companion object {
        @JsValue("text")
        val text: MobileStepperVariant

        @JsValue("dots")
        val dots: MobileStepperVariant

        @JsValue("progress")
        val progress: MobileStepperVariant
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface MobileStepperPosition {
    companion object {
        @JsValue("bottom")
        val bottom: MobileStepperPosition

        @JsValue("top")
        val top: MobileStepperPosition

        @JsValue("static")
        val static: MobileStepperPosition
    }
}
