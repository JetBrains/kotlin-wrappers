// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface PaginationColor {
    companion object {
        @JsValue("primary")
        val primary: PaginationColor

        @JsValue("secondary")
        val secondary: PaginationColor

        @JsValue("standard")
        val standard: PaginationColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface PaginationVariant {
    companion object {
        @JsValue("text")
        val text: PaginationVariant

        @JsValue("outlined")
        val outlined: PaginationVariant
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface PaginationShape {
    companion object {
        @JsValue("circular")
        val circular: PaginationShape

        @JsValue("rounded")
        val rounded: PaginationShape
    }
}
