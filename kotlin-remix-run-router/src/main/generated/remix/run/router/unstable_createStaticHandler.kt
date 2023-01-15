@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

external fun unstable_createStaticHandler(routes: Array<AgnosticRouteObject>): StaticHandler
