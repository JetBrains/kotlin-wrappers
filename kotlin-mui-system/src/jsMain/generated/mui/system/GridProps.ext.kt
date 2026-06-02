// Automatically generated - do not modify!

package mui.system

import seskar.js.JsValue

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

/**
 * Lost from union: number
 */
sealed external interface GridSize {
    companion object {
        @JsValue("auto")
        val auto: GridSize

        @JsValue("grow")
        val grow: GridSize

        @JsValue("false")
        val `false`: GridSize
    }
}
