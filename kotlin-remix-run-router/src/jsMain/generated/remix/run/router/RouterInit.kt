@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Initialization options for createRouter
 */

sealed external interface RouterInit {
    var routes: js.core.ReadonlyArray<AgnosticRouteObject>
    var history: History
    var basename: String?

    /**
     * @deprecated Use `mapRouteProperties` instead
     */
    var detectErrorBoundary: DetectErrorBoundaryFunction?
    var mapRouteProperties: MapRoutePropertiesFunction?
    var future: FutureConfig?
    var hydrationData: HydrationState?
}
