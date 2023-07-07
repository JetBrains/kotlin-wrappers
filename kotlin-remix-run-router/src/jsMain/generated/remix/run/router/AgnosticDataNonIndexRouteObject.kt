package remix.run.router


sealed external interface AgnosticDataNonIndexRouteObject : AgnosticNonIndexRouteObject {
    override var children: js.core.ReadonlyArray<AgnosticDataRouteObject>?
    override var id: String?
}
