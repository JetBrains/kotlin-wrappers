// Automatically generated - do not modify!

@file:JsModule("@mui/material/Container")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ContainerProps :
    ContainerOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

external interface ContainerOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ContainerClasses?

    /**
     * If `true`, the left and right padding is removed.
     * @default false
     */
    var disableGutters: Boolean?

    /**
     * Set the max-width to match the min-width of the current breakpoint.
     * This is useful if you'd prefer to design for a fixed set of sizes
     * instead of trying to accommodate a fully fluid viewport.
     * It's fluid by default.
     * @default false
     */
    var fixed: Boolean?

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
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Container](https://mui.com/material-ui/react-container/)
 *
 * API:
 *
 * - [Container API](https://mui.com/material-ui/api/container/)
 */
@JsName("default")
external val Container: react.FC<ContainerProps>
