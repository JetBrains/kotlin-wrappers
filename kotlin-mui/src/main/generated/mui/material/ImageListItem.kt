// Automatically generated - do not modify!

@file:JsModule("@mui/material/ImageListItem")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ImageListItemProps :
    react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component, normally an `<img>`.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ImageListItemClasses?

    /**
     * Width of the item in number of grid columns.
     * @default 1
     */
    var cols: Number?

    /**
     * Height of the item in number of grid rows.
     * @default 1
     */
    var rows: Number?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Image list](https://mui.com/material-ui/react-image-list/)
 *
 * API:
 *
 * - [ImageListItem API](https://mui.com/material-ui/api/image-list-item/)
 */
@JsName("default")
external val ImageListItem: react.FC<ImageListItemProps>
