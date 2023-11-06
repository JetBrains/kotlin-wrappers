// Automatically generated - do not modify!

package mui.material

typealias TableCellBaseProps = react.dom.html.TdHTMLAttributes<web.html.HTMLTableCellElement>

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{asc: 'asc', desc: 'desc', false: false}/*union*/)""")
sealed external interface SortDirection {
    companion object {
        val asc: SortDirection
        val desc: SortDirection
        val `false`: SortDirection
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{head: 'head', body: 'body', footer: 'footer'}/*union*/)""")
sealed external interface TableCellVariant {
    companion object {
        val head: TableCellVariant
        val body: TableCellVariant
        val footer: TableCellVariant
    }
}

typealias TableCellAlign = react.dom.html.TdAlign /* 'inherit' | 'left' | 'center' | 'right' | 'justify' */

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{normal: 'normal', checkbox: 'checkbox', none: 'none'}/*union*/)""")
sealed external interface TableCellPadding {
    companion object {
        val normal: TableCellPadding
        val checkbox: TableCellPadding
        val none: TableCellPadding
    }
}
