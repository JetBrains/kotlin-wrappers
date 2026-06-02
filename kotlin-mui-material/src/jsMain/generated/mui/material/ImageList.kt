// Automatically generated - do not modify!

@file:JsModule("@mui/material/ImageList")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLUListElement

external interface ImageListProps :
    ImageListOwnProps,
    HTMLAttributes<HTMLUListElement>,
    PropsWithComponent

external interface ImageListOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component, normally `ImageListItem`s.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ImageListClasses?

    /**
     * Number of columns.
     * @default 2
     */
    var cols: Number?

    /**
     * The gap between items in px.
     * @default 4
     */
    var gap: Number?

    /**
     * The height of one row in px.
     * @default 'auto'
     */
    var rowHeight: Any? /* number | 'auto' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The variant to use.
     * @default 'standard'
     */
    var variant: ImageListVariant?
}

/**
 *
 * Demos:
 *
 * - [Image List](https://v6.mui.com/material-ui/react-image-list/)
 *
 * API:
 *
 * - [ImageList API](https://v6.mui.com/material-ui/api/image-list/)
 */
@JsName("default")
external val ImageList: FC<ImageListProps>
