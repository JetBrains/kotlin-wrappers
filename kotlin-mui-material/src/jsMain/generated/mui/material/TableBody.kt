// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableBody")

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

external interface TableBodyProps :
    TableBodyOwnProps,
    HTMLAttributes<HTMLTableSectionElement>,
    PropsWithComponent

external interface TableBodyOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component, normally `TableRow`.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableBodyClasses?

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
 * - [TableBody API](https://v6.mui.com/material-ui/api/table-body/)
 */
@JsName("default")
external val TableBody: FC<TableBodyProps>
