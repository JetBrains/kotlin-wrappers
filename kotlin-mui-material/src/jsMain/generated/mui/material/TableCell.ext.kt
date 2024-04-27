// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

typealias TableCellBaseProps = react.dom.html.TdHTMLAttributes<web.html.HTMLTableCellElement>

@JsVirtual
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

@JsVirtual
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

typealias TableCellAlign = react.dom.html.TdAlign /* 'inherit' | 'left' | 'center' | 'right' | 'justify' */

@JsVirtual
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
