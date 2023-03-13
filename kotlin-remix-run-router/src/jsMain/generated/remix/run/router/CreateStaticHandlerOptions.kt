@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


sealed external interface CreateStaticHandlerOptions {
    var basename: String?
    var detectErrorBoundary: DetectErrorBoundaryFunction?
}
