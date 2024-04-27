// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GridDirection {
    companion object {
        @JsValue("row")
        val row: GridDirection

        @JsValue("row-reverse")
        val rowReverse: GridDirection

        @JsValue("column")
        val column: GridDirection

        @JsValue("column-reverse")
        val columnReverse: GridDirection
    }
}

@JsVirtual
sealed external interface GridWrap {
    companion object {
        @JsValue("nowrap")
        val nowrap: GridWrap

        @JsValue("wrap")
        val wrap: GridWrap

        @JsValue("wrap-reverse")
        val wrapReverse: GridWrap
    }
}
