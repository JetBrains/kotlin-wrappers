// Automatically generated - do not modify!

@file:JsModule("@mui/material/Skeleton")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface SkeletonProps :
    SkeletonOwnProps,
    HTMLAttributes<HTMLSpanElement>,
    PropsWithComponent

external interface SkeletonPropsVariantOverrides

external interface SkeletonOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The animation.
     * If `false` the animation effect is disabled.
     * @default 'pulse'
     */
    var animation: SkeletonAnimation?

    /**
     * Optional children to infer width and height from.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SkeletonClasses?

    /**
     * Height of the skeleton.
     * Useful when you don't want to adapt the skeleton to a text element but for instance a card.
     */
    var height: Any? /* number | string */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The type of content that will be rendered.
     * @default 'text'
     */
    var variant: SkeletonVariant?

    /**
     * Width of the skeleton.
     * Useful when the skeleton is inside an inline element with no width of its own.
     */
    var width: Any? /* number | string */
}

/**
 *
 * Demos:
 *
 * - [Skeleton](https://v6.mui.com/material-ui/react-skeleton/)
 *
 * API:
 *
 * - [Skeleton API](https://v6.mui.com/material-ui/api/skeleton/)
 */
@JsName("default")
external val Skeleton: FC<SkeletonProps>
