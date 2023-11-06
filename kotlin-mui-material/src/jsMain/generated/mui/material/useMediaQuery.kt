// Automatically generated - do not modify!

@file:JsModule("@mui/material/useMediaQuery")

package mui.material

external interface UseMediaQueryOptions {
    /**
     * As `window.matchMedia()` is unavailable on the server,
     * it returns a default matches during the first mount.
     * @default false
     */
    var defaultMatches: Boolean?

    /**
     * You can provide your own implementation of matchMedia.
     * This can be used for handling an iframe content window.
     */
    var matchMedia: ((query: String) -> web.cssom.MediaQueryList)?

    /**
     * To perform the server-side hydration, the hook needs to render twice.
     * A first time with `defaultMatches`, the value of the server, and a second time with the resolved value.
     * This double pass rendering cycle comes with a drawback: it's slower.
     * You can set this option to `true` if you use the returned value **only** client-side.
     * @default false
     */
    var noSsr: Boolean?

    /**
     * You can provide your own implementation of `matchMedia`, it's used when rendering server-side.
     */
    var ssrMatchMedia: ((query: String) -> dynamic)?
}

@JsName("default")
external fun useMediaQuery(
    queryInput: String,
    options: UseMediaQueryOptions? = definedExternally,
): Boolean

@JsName("default")
external fun <Theme : Any> useMediaQuery(
    queryInput: (theme: Theme) -> String,
    options: UseMediaQueryOptions? = definedExternally,
): Boolean
