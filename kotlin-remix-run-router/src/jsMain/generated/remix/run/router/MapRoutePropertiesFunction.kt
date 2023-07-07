package remix.run.router


/**
 * Function provided by the framework-aware layers to set any framework-specific
 * properties from framework-agnostic properties
 */

sealed external interface MapRoutePropertiesFunction {

    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(route: AgnosticRouteObject): Any /* {
    hasErrorBoundary: boolean;
} & Record<string, any> */

}
