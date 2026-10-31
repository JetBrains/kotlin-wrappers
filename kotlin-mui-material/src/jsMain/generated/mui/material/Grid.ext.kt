// Automatically generated - do not modify!

package mui.material

import js.reflect.unsafeCast
import seskar.js.JsRawValue
import seskar.js.JsValue

sealed external interface GridDirection {
    companion object {
        @JsValue("row")
        val row: GridDirection

        @JsValue("row-reverse")
        val rowReverse: GridDirection
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

sealed external interface GridSize {
    companion object {
        @JsValue("auto")
        val auto: GridSize

        @JsValue("grow")
        val grow: GridSize

        @JsRawValue("false")
        val `false`: GridSize
    }
}

inline fun GridSize(
    value: Number,
): GridSize =
    unsafeCast(value)

sealed external interface GridOffset {
    companion object {
        @JsValue("auto")
        val auto: GridOffset
    }
}

inline fun GridOffset(
    value: Number,
): GridOffset =
    unsafeCast(value)
