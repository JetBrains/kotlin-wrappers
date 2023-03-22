@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface ResultType {
    companion object {
        val data: ResultType
        val deferred: ResultType
        val redirect: ResultType
        val error: ResultType
    }
}
