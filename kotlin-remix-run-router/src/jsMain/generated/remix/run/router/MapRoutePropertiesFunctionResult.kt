package remix.run.router


sealed external interface MapRoutePropertiesFunctionResult : js.core.ReadonlyRecord<String, Any> {
    var hasErrorBoundary: Boolean
}
