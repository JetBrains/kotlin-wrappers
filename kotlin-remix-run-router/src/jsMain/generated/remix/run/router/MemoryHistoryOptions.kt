@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


external interface MemoryHistoryOptions {
    var initialEntries: js.core.ReadonlyArray<InitialEntry>?
    var initialIndex: Double?
    var v5Compat: Boolean?
}
