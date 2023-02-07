@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

external fun createStaticHandler(routes: js.core.ReadonlyArray<AgnosticRouteObject>, opts: CreateStaticHandlerOpts = definedExternally): StaticHandler
