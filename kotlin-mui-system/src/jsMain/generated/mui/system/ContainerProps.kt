// Automatically generated - do not modify!

package mui.system

import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ContainerProps :
    HTMLAttributes<HTMLDivElement>,
    PropsWithChildren,
    PropsWithSx {
    override var children: ReactNode?

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
    var maxWidth: Any? /* Breakpoint | false */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}
