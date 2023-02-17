@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


typealias DeferFunction = (data: js.core.ReadonlyRecord<String, Any>, init: Any /* number | ResponseInit */) -> DeferredData
