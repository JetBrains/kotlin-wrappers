@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

external fun createStaticHandler(routes: js.core.ReadonlyArray<AgnosticRouteObject>, opts: CreateStaticHandlerOpts = definedExternally): StaticHandler
