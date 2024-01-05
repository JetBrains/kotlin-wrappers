@file:JsModule("react-router")

package react.router

import js.array.ReadonlyArray

external fun useRoutes(routes: ReadonlyArray<RouteObject>): react.ReactElement<*>?
