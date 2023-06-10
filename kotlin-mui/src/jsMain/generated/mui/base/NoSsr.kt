// Automatically generated - do not modify!

@file:JsModule("@mui/base/NoSsr")

package mui.base

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
 * - [No SSR](https://mui.com/base/react-no-ssr/)
 *
 * API:
 *
 * - [NoSsr API](https://mui.com/base/react-no-ssr/components-api/#no-ssr)
 */
@JsName("default")
external val NoSsr: react.FC<NoSsrProps>
