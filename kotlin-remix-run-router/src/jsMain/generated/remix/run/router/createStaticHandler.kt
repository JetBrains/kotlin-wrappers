@file:JsModule("@remix-run/router")

package remix.run.router

external fun createStaticHandler(
    routes: js.core.ReadonlyArray<AgnosticRouteObject>,
    opts: CreateStaticHandlerOptions = definedExternally,
): StaticHandler
