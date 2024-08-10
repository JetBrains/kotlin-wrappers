package js.temporal

import seskar.js.JsValue

sealed external interface RoundingMode {
    companion object {
        @JsValue("ceil")
        val ceil: RoundingMode

        @JsValue("floor")
        val floor: RoundingMode

        @JsValue("expand")
        val expand: RoundingMode

        @JsValue("trunc")
        val trunc: RoundingMode

        @JsValue("halfCeil")
        val halfCeil: RoundingMode

        @JsValue("halfFloor")
        val halfFloor: RoundingMode

        @JsValue("halfExpand")
        val halfExpand: RoundingMode

        @JsValue("halfTrunc")
        val halfTrunc: RoundingMode

        @JsValue("halfEven")
        val halfEven: RoundingMode
    }
}
