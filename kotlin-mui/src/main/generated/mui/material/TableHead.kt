// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableHead")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface TableHeadProps : react.PropsWithChildren {
    /**
     * The content of the component, normally `TableRow`.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableHeadClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Tables](https://mui.com/components/tables/)
 *
 * API:
 *
 * - [TableHead API](https://mui.com/api/table-head/)
 */
@JsName("default")
external val TableHead: react.FC<TableHeadProps>
