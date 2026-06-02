// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableHead")

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

external interface TableHeadProps :
    TableHeadOwnProps,
    HTMLAttributes<HTMLTableSectionElement>,
    PropsWithComponent

external interface TableHeadOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component, normally `TableRow`.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableHeadClasses?

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
 * - [TableHead API](https://v6.mui.com/material-ui/api/table-head/)
 */
@JsName("default")
external val TableHead: FC<TableHeadProps>
