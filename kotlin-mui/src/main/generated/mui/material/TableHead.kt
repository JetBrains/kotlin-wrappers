// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableHead")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TableHeadProps :
    react.dom.html.HTMLAttributes<dom.html.HTMLTableSectionElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
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
 * - [Tables](https://mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [TableHead API](https://mui.com/material-ui/api/table-head/)
 */
@JsName("default")
external val TableHead: react.FC<TableHeadProps>
