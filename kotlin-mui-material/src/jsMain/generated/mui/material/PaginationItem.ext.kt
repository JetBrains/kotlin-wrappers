// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

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

@JsVirtual
sealed external interface PaginationItemVariant {
    companion object {
        @JsValue("text")
        val text: PaginationItemVariant

        @JsValue("outlined")
        val outlined: PaginationItemVariant
    }
}

@JsVirtual
sealed external interface PaginationItemShape {
    companion object {
        @JsValue("circular")
        val circular: PaginationItemShape

        @JsValue("rounded")
        val rounded: PaginationItemShape
    }
}
