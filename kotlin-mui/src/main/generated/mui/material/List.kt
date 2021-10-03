// Automatically generated - do not modify!

@file:JsModule("@mui/material/List")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface ListProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListClasses

    /**
     * If `true`, compact vertical padding designed for keyboard and mouse input is used for
     * the list and list items.
     * The prop is available to descendant components as the `dense` context.
     * @default false
     */
    var dense: Boolean

    /**
     * If `true`, vertical padding is removed from the list.
     * @default false
     */
    var disablePadding: Boolean

    /**
     * The content of the subheader, normally `ListSubheader`.
     */
    var subheader: react.ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Lists](https://mui.com/components/lists/)
 * - [Transfer List](https://mui.com/components/transfer-list/)
 *
 * API:
 *
 * - [List API](https://mui.com/api/list/)
 */
@JsName("default")
external val List: react.FC<ListProps>
