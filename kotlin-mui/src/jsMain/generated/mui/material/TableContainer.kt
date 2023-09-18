// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableContainer")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TableContainerProps :
    TableContainerOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

external interface TableContainerOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component, normally `Table`.
     */
    override var children: react.ReactNode?

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
 * - [Table](https://mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [TableContainer API](https://mui.com/material-ui/api/table-container/)
 */
@JsName("default")
external val TableContainer: react.FC<TableContainerProps>
