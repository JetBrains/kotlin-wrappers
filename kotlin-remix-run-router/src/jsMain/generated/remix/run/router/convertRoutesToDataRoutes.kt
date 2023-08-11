@file:JsModule("@remix-run/router")

package remix.run.router


external fun convertRoutesToDataRoutes(
    routes: js.core.ReadonlyArray<AgnosticRouteObject>,
    mapRouteProperties: MapRoutePropertiesFunction,
    parentPath: js.core.ReadonlyArray<Double> = definedExternally,
    manifest: RouteManifest = definedExternally,
): js.core.ReadonlyArray<AgnosticDataRouteObject>
