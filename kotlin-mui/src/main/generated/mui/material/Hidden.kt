// Automatically generated - do not modify!

@file:JsModule("@mui/material/Hidden")
@file:JsNonModule

package mui.material

external interface HiddenProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Specify which implementation to use.  'js' is the default, 'css' works better for
     * server-side rendering.
     * @default 'js'
     */
    var implementation: HiddenImplementation?

    /**
     * You can use this prop when choosing the `js` implementation with server-side rendering.
     *
     * As `window.innerWidth` is unavailable on the server,
     * we default to rendering an empty component during the first mount.
     * You might want to use a heuristic to approximate
     * the screen width of the client browser screen width.
     *
     * For instance, you could be using the user-agent or the client-hints.
     * https://caniuse.com/#search=client%20hint
     */
    var initialWidth: dynamic

    /**
     * If `true`, screens this size and down are hidden.
     * @default false
     */
    var lgDown: Boolean?

    /**
     * If `true`, screens this size and up are hidden.
     * @default false
     */
    var lgUp: Boolean?

    /**
     * If `true`, screens this size and down are hidden.
     * @default false
     */
    var mdDown: Boolean?

    /**
     * If `true`, screens this size and up are hidden.
     * @default false
     */
    var mdUp: Boolean?

    /**
     * Hide the given breakpoint(s).
     */
    var only: dynamic

    /**
     * If `true`, screens this size and down are hidden.
     * @default false
     */
    var smDown: Boolean?

    /**
     * If `true`, screens this size and up are hidden.
     * @default false
     */
    var smUp: Boolean?

    /**
     * If `true`, screens this size and down are hidden.
     * @default false
     */
    var xlDown: Boolean?

    /**
     * If `true`, screens this size and up are hidden.
     * @default false
     */
    var xlUp: Boolean?

    /**
     * If `true`, screens this size and down are hidden.
     * @default false
     */
    var xsDown: Boolean?

    /**
     * If `true`, screens this size and up are hidden.
     * @default false
     */
    var xsUp: Boolean?
}

/**
 * Responsively hides children based on the selected implementation.
 *
 * Demos:
 *
 * - [Hidden](https://mui.com/components/hidden/)
 *
 * API:
 *
 * - [Hidden API](https://mui.com/api/hidden/)
 */
@JsName("default")
external val Hidden: react.FC<HiddenProps>
