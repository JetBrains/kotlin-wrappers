// Automatically generated - do not modify!

@file:JsModule("@mui/material/ImageListItemBar")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ImageListItemBarProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithSx {
    /**
     * An IconButton element to be used as secondary action target
     * (primary action target is the item itself).
     */
    var actionIcon: ReactNode?

    /**
     * Position of secondary action IconButton.
     * @default 'right'
     */
    var actionPosition: ActionPosition?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ImageListItemBarClasses?

    /**
     * Position of the title bar.
     * @default 'bottom'
     */
    var position: ImageListItemBarPosition?

    /**
     * String or element serving as subtitle (support text).
     */
    var subtitle: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Title to be displayed.
     */
    var title: ReactNode?
}

/**
 *
 * Demos:
 *
 * - [Image List](https://v6.mui.com/material-ui/react-image-list/)
 *
 * API:
 *
 * - [ImageListItemBar API](https://v6.mui.com/material-ui/api/image-list-item-bar/)
 */
@JsName("default")
external val ImageListItemBar: FC<ImageListItemBarProps>
