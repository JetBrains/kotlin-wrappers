// Automatically generated - do not modify!

package mui.material

import react.dom.html.TdAlign
import react.dom.html.TdHTMLAttributes
import seskar.js.JsValue
import web.html.HTMLTableCellElement

typealias TableCellBaseProps = TdHTMLAttributes<HTMLTableCellElement>

sealed external interface SortDirection {
    companion object {
        @JsValue("asc")
        val asc: SortDirection

        @JsValue("desc")
        val desc: SortDirection

        @JsValue("`false`")
        val `false`: SortDirection
    }
}

sealed external interface TableCellVariant {
    companion object {
        @JsValue("head")
        val head: TableCellVariant

        @JsValue("body")
        val body: TableCellVariant

        @JsValue("footer")
        val footer: TableCellVariant
    }
}

typealias TableCellAlign = TdAlign /* 'inherit' | 'left' | 'center' | 'right' | 'justify' */

sealed external interface TableCellPadding {
    companion object {
        @JsValue("normal")
        val normal: TableCellPadding

        @JsValue("checkbox")
        val checkbox: TableCellPadding

        @JsValue("none")
        val none: TableCellPadding
    }
}
