@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Function provided by the framework-aware layers to set `hasErrorBoundary`
 * from the framework-aware `errorElement` prop
 */
typealias DetectErrorBoundaryFunction = (route: AgnosticRouteObject) -> Boolean
