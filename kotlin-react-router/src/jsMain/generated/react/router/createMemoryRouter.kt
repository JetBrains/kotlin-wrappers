@file:JsModule("react-router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.Router as RemixRouter

external fun createMemoryRouter(routes: js.core.ReadonlyArray<RouteObject>, opts: CreateMemoryRouterOpts = definedExternally): RemixRouter
