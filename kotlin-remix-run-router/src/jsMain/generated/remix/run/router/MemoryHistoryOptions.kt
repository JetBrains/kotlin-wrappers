@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


external interface MemoryHistoryOptions {
    var initialEntries: js.core.ReadonlyArray<InitialEntry>?
    var initialIndex: Double?
    var v5Compat: Boolean?
}

