@file:JsModule("react-router-dom")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import react.router.RouteObject
import remix.run.router.Router as RemixRouter

external fun createHashRouter(routes: js.core.ReadonlyArray<RouteObject>, opts: CreateHashRouterOpts = definedExternally): RemixRouter
