@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


sealed external interface AgnosticDataIndexRouteObject : AgnosticIndexRouteObject {
    override var id: String?
}
