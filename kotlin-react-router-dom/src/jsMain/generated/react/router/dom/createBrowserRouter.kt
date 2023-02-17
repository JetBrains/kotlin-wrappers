@file:JsModule("react-router-dom")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom

import react.router.RouteObject
import remix.run.router.Router as RemixRouter

external fun createBrowserRouter(routes: js.core.ReadonlyArray<RouteObject>, opts: CreateBrowserRouterOpts = definedExternally): RemixRouter
