// Automatically generated - do not modify!

@file:JsModule("@mui/material/ImageListItem")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.LiHTMLAttributes
import web.html.HTMLLIElement

external interface ImageListItemProps :
    ImageListItemOwnProps,
    LiHTMLAttributes<HTMLLIElement>,
    PropsWithComponent

external interface ImageListItemOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component, normally an `<img>`.
     */
    override var children: ReactNode?

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
 * - [Image List](https://v6.mui.com/material-ui/react-image-list/)
 *
 * API:
 *
 * - [ImageListItem API](https://v6.mui.com/material-ui/api/image-list-item/)
 */
@JsName("default")
external val ImageListItem: FC<ImageListItemProps>
