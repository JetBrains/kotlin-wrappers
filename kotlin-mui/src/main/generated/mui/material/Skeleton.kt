// Automatically generated - do not modify!

@file:JsModule("@mui/material/Skeleton")
@file:JsNonModule

package mui.material

external interface SkeletonProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement>,
    react.PropsWithChildren {
    /**
     * The animation.
     * If `false` the animation effect is disabled.
     * @default 'pulse'
     */
    var animation: SkeletonAnimation?

    /**
     * Optional children to infer width and height from.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SkeletonClasses?

    /**
     * Height of the skeleton.
     * Useful when you don't want to adapt the skeleton to a text element but for instance a card.
     */
    var height: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The type of content that will be rendered.
     * @default 'text'
     */
    var variant: SkeletonVariant?

    /**
     * Width of the skeleton.
     * Useful when the skeleton is inside an inline element with no width of its own.
     */
    var width: dynamic
}

/**
 *
 * Demos:
 *
 * - [Skeleton](https://mui.com/components/skeleton/)
 *
 * API:
 *
 * - [Skeleton API](https://mui.com/api/skeleton/)
 */
@JsName("default")
external val Skeleton: react.FC<SkeletonProps>
