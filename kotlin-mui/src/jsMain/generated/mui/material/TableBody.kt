// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableBody")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TableBodyProps :
    react.dom.html.HTMLAttributes<web.html.HTMLTableSectionElement>,
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
 * - [Tables](https://mui.com/material-ui/react-table/)
 *
 * API:
 *
 * - [TableBody API](https://mui.com/material-ui/api/table-body/)
 */
@JsName("default")
external val TableBody: react.FC<TableBodyProps>
