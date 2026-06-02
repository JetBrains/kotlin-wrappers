// Automatically generated - do not modify!

package mui.material

import react.PropsWithChildren
import react.ReactNode

external interface NoSsrProps : PropsWithChildren {
    /**
     * You can wrap a node.
     */
    override var children: ReactNode?

    /**
     * If `true`, the component will not only prevent server-side rendering.
     * It will also defer the rendering of the children into a different screen frame.
     * @default false
     */
    var defer: Boolean?

    /**
     * The fallback content to display.
     * @default null
     */
    var fallback: ReactNode?
}
