// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableBody")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface TableBodyProps : react.PropsWithChildren {
    /**
     * The content of the component, normally `TableRow`.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableBodyClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Tables](https://mui.com/components/tables/)
 *
 * API:
 *
 * - [TableBody API](https://mui.com/api/table-body/)
 */
@JsName("default")
external val TableBody: react.FC<TableBodyProps>
