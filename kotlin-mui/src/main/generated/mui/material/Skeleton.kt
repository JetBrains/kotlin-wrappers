// Automatically generated - do not modify!

@file:JsModule("@mui/material/Skeleton")
@file:JsNonModule

package mui.material

external interface SkeletonProps : react.PropsWithChildren {
    /**
     * The animation.
     * If `false` the animation effect is disabled.
     * @default 'pulse'
     */
    var animation: Union /* 'pulse' | 'wave' | false */

    /**
     * Optional children to infer width and height from.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SkeletonClasses

    /**
     * Height of the skeleton.
     * Useful when you don't want to adapt the skeleton to a text element but for instance a card.
     */
    var height: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The type of content that will be rendered.
     * @default 'text'
     */
    var variant: Union /* 'text' | 'rectangular' | 'circular', SkeletonPropsVariantOverrides */

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
