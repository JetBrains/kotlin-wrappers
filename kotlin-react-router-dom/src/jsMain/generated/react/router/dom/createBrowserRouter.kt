@file:JsModule("react-router-dom")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import react.router.RouteObject
import remix.run.router.Router as RemixRouter

external fun createBrowserRouter(routes: js.core.ReadonlyArray<RouteObject>, opts: CreateBrowserRouterOpts = definedExternally): RemixRouter
