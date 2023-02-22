@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


external fun convertRoutesToDataRoutes(
    routes: js.core.ReadonlyArray<AgnosticRouteObject>,
    parentPath: js.core.ReadonlyArray<Double> = definedExternally,
    allIds: js.collections.ReadonlySet<String> = definedExternally
): js.core.ReadonlyArray<AgnosticDataRouteObject>
