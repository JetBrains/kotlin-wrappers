// Automatically generated - do not modify!

package mui.material

external interface NoSsrProps : react.PropsWithChildren {
    /**
     * You can wrap a node.
     */
    override var children: react.ReactNode?

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
    var fallback: react.ReactNode?
}
