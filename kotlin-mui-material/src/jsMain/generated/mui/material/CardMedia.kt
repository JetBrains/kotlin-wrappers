// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardMedia")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface CardMediaProps :
    CardMediaOwnProps,
    PropsWithComponent

external interface CardMediaOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardMediaClasses?

    /**
     * Image to be displayed as a background image.
     * Either `image` or `src` prop must be specified.
     * Note that caller must specify height otherwise the image will not be visible.
     */
    var image: String?

    /**
     * An alias for `image` property.
     * Available only with media components.
     * Media components: `video`, `audio`, `picture`, `iframe`, `img`.
     */
    var src: String?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Card](https://v6.mui.com/material-ui/react-card/)
 *
 * API:
 *
 * - [CardMedia API](https://v6.mui.com/material-ui/api/card-media/)
 */
@JsName("default")
external val CardMedia: FC<CardMediaProps>
