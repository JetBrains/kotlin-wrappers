// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface PaginationItemColor {
    companion object {
        @JsValue("standard")
        val standard: PaginationItemColor

        @JsValue("primary")
        val primary: PaginationItemColor

        @JsValue("secondary")
        val secondary: PaginationItemColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface PaginationItemVariant {
    companion object {
        @JsValue("text")
        val text: PaginationItemVariant

        @JsValue("outlined")
        val outlined: PaginationItemVariant
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface PaginationItemShape {
    companion object {
        @JsValue("circular")
        val circular: PaginationItemShape

        @JsValue("rounded")
        val rounded: PaginationItemShape
    }
}
