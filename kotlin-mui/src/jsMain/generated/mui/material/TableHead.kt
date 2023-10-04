// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableHead")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TableHeadProps :
    TableHeadOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLTableSectionElement>,
    mui.types.PropsWithComponent

external interface TableHeadOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component, normally `TableRow`.
     */
    override var children: react.ReactNode?

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
 * - [Table](https://mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [TableHead API](https://mui.com/material-ui/api/table-head/)
 */
@JsName("default")
external val TableHead: react.FC<TableHeadProps>
