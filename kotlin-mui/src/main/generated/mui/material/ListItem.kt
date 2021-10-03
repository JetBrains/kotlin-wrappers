// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItem")
@file:JsNonModule

package mui.material

external interface ListItemProps : react.Props {
    /**
     * The components used for each slot inside the InputBase.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var componentsProps: dynamic
}

/**
 * Uses an additional container component if `ListItemSecondaryAction` is the last child.
 *
 * Demos:
 *
 * - [Lists](https://mui.com/components/lists/)
 * - [Transfer List](https://mui.com/components/transfer-list/)
 *
 * API:
 *
 * - [ListItem API](https://mui.com/api/list-item/)
 */
@JsName("default")
external val ListItem: react.FC<ListItemProps>
