// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItemAvatar")
@file:JsNonModule

package mui.material

external interface ListItemAvatarProps : react.PropsWithChildren {
    /**
     * The content of the component, normally an `Avatar`.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemAvatarClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 * A simple wrapper to apply `List` styles to an `Avatar`.
 *
 * Demos:
 *
 * - [Lists](https://mui.com/components/lists/)
 *
 * API:
 *
 * - [ListItemAvatar API](https://mui.com/api/list-item-avatar/)
 */
@JsName("default")
external val ListItemAvatar: react.FC<ListItemAvatarProps>
