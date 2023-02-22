@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


external interface AgnosticDataNonIndexRouteObject : AgnosticNonIndexRouteObject {
    override var children: js.core.ReadonlyArray<AgnosticDataRouteObject>?
    override var id: String?
}

