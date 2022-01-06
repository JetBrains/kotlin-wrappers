// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableContainer")
@file:JsNonModule

package mui.material

external interface TableContainerProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.types.PropsWithComponent {
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
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Tables](https://mui.com/components/tables/)
 *
 * API:
 *
 * - [TableContainer API](https://mui.com/api/table-container/)
 */
@JsName("default")
external val TableContainer: react.FC<TableContainerProps>
