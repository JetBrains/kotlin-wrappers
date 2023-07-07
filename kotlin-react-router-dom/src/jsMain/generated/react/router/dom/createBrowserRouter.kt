@file:JsModule("react-router-dom")

package react.router.dom

import react.router.RouteObject
import remix.run.router.Router as RemixRouter

external fun createBrowserRouter(routes: js.core.ReadonlyArray<RouteObject>, opts: DOMRouterOpts = definedExternally): RemixRouter
