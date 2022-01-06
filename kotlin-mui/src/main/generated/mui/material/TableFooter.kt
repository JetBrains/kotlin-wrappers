// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableFooter")
@file:JsNonModule

package mui.material

external interface TableFooterProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLTableSectionElement>,
    react.PropsWithChildren,
    mui.types.PropsWithComponent {
    /**
     * The content of the component, normally `TableRow`.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TableFooterClasses?

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
 * - [TableFooter API](https://mui.com/api/table-footer/)
 */
@JsName("default")
external val TableFooter: react.FC<TableFooterProps>
