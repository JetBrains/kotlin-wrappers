// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableContainer")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface TableContainerProps :
    TableContainerOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface TableContainerOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component, normally `Table`.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableContainerClasses?

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
 * - [TableContainer API](https://v6.mui.com/material-ui/api/table-container/)
 */
@JsName("default")
external val TableContainer: FC<TableContainerProps>
