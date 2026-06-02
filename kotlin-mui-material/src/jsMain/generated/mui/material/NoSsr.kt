// Automatically generated - do not modify!

@file:JsModule("@mui/material/NoSsr")

package mui.material

import react.FC

/**
 * NoSsr purposely removes components from the subject of Server Side Rendering (SSR).
 *
 * This component can be useful in a variety of situations:
 *
 * * Escape hatch for broken dependencies not supporting SSR.
 * * Improve the time-to-first paint on the client by only rendering above the fold.
 * * Reduce the rendering time on the server.
 * * Under too heavy server load, you can turn on service degradation.
 *
 * Demos:
 *
 * - [No SSR](https://v6.mui.com/material-ui/react-no-ssr/)
 *
 * API:
 *
 * - [NoSsr API](https://v6.mui.com/material-ui/api/no-ssr/)
 */
@JsName("default")
external val NoSsr: FC<NoSsrProps>
