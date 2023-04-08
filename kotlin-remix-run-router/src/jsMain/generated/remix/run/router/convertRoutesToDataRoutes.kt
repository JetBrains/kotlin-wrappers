@file:JsModule("@remix-run/router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


external fun convertRoutesToDataRoutes(
    routes: js.core.ReadonlyArray<AgnosticRouteObject>,
    detectErrorBoundary: DetectErrorBoundaryFunction,
    parentPath: js.core.ReadonlyArray<Double> = definedExternally,
    manifest: RouteManifest = definedExternally
): js.core.ReadonlyArray<AgnosticDataRouteObject>
