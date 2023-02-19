@file:JsModule("react-router")

package react.router

import js.core.ReadonlyArray

external fun useRoutes(routes: ReadonlyArray<RouteObject>): react.ReactElement<*>?
