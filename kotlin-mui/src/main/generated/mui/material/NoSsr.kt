// Automatically generated - do not modify!

@file:JsModule("@mui/material/NoSsr")
@file:JsNonModule

package mui.material

external interface NoSsrProps : react.PropsWithChildren {
    /**
     * You can wrap a node.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * If `true`, the component will not only prevent server-side rendering.
     * It will also defer the rendering of the children into a different screen frame.
     * @default false
     */
    var defer: Boolean

    /**
     * The fallback content to display.
     * @default null
     */
    var fallback: react.ReactNode
}

/**
 * NoSsr purposely removes components from the subject of Server Side Rendering (SSR).
 *
 * This component can be useful in a variety of situations:
 *
 * *   Escape hatch for broken dependencies not supporting SSR.
 * *   Improve the time-to-first paint on the client by only rendering above the fold.
 * *   Reduce the rendering time on the server.
 * *   Under too heavy server load, you can turn on service degradation.
 *
 * Demos:
 *
 * - [No Ssr](https://mui.com/components/no-ssr/)
 *
 * API:
 *
 * - [NoSsr API](https://mui.com/api/no-ssr/)
 */
@JsName("default")
external val NoSsr: react.FC<NoSsrProps>
