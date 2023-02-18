@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.router

import js.core.ReadonlyArray

inline fun useRoutes(routes: ReadonlyArray<RouteObject>): react.ReactElement<*>? =
    useRoutes(routes, undefined.unsafeCast<String>())
