// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardMedia")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface CardMediaProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

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
 * - [Card](https://mui.com/material-ui/react-card/)
 *
 * API:
 *
 * - [CardMedia API](https://mui.com/material-ui/api/card-media/)
 */
@JsName("default")
external val CardMedia: react.FC<CardMediaProps>
