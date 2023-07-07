package remix.run.router


/**
 * Function provided by the framework-aware layers to set `hasErrorBoundary`
 * from the framework-aware `errorElement` prop
 *
 * @deprecated Use `mapRouteProperties` instead
 */
typealias DetectErrorBoundaryFunction = (route: AgnosticRouteObject) -> Boolean
