// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue

sealed /* union */
external interface PaginationItemColor {
    companion object {
        @JsValue("standard")
        val standard: PaginationItemColor

        @JsValue("primary")
        val primary: PaginationItemColor

        @JsValue("secondary")
        val secondary: PaginationItemColor
    }
}

sealed /* union */
external interface PaginationItemVariant {
    companion object {
        @JsValue("text")
        val text: PaginationItemVariant

        @JsValue("outlined")
        val outlined: PaginationItemVariant
    }
}

sealed /* union */
external interface PaginationItemShape {
    companion object {
        @JsValue("circular")
        val circular: PaginationItemShape

        @JsValue("rounded")
        val rounded: PaginationItemShape
    }
}
