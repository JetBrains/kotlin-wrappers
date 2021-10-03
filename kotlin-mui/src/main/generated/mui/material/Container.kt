// Automatically generated - do not modify!

@file:JsModule("@mui/material/Container")
@file:JsNonModule

package mui.material

external interface ContainerProps : react.PropsWithChildren {
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ContainerClasses

    /**
     * If `true`, the left and right padding is removed.
     * @default false
     */
    var disableGutters: Boolean

    /**
     * Set the max-width to match the min-width of the current breakpoint.
     * This is useful if you'd prefer to design for a fixed set of sizes
     * instead of trying to accommodate a fully fluid viewport.
     * It's fluid by default.
     * @default false
     */
    var fixed: Boolean

    /**
     * Determine the max-width of the container.
     * The container width grows with the size of the screen.
     * Set to `false` to disable `maxWidth`.
     * @default 'lg'
     */
    var maxWidth: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Container](https://mui.com/components/container/)
 *
 * API:
 *
 * - [Container API](https://mui.com/api/container/)
 */
@JsName("default")
external val Container: react.FC<ContainerProps>
