// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItemAvatar")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface ListItemAvatarProps : react.PropsWithChildren {
    /**
     * The content of the component, normally an `Avatar`.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemAvatarClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
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
