// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serviceworker

// language=JavaScript
@JsName("""(/*union*/{activated: 'activated', activating: 'activating', installed: 'installed', installing: 'installing', parsed: 'parsed', redundant: 'redundant'}/*union*/)""")
sealed external interface ServiceWorkerState {
    companion object {
        val activated: ServiceWorkerState
        val activating: ServiceWorkerState
        val installed: ServiceWorkerState
        val installing: ServiceWorkerState
        val parsed: ServiceWorkerState
        val redundant: ServiceWorkerState
    }
}
