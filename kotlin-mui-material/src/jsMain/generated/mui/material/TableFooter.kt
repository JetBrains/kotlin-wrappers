// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableFooter")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLTableSectionElement

external interface TableFooterProps :
    TableFooterOwnProps,
    HTMLAttributes<HTMLTableSectionElement>,
    PropsWithComponent

external interface TableFooterOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component, normally `TableRow`.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableFooterClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Table](https://v6.mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [TableFooter API](https://v6.mui.com/material-ui/api/table-footer/)
 */
@JsName("default")
external val TableFooter: FC<TableFooterProps>
