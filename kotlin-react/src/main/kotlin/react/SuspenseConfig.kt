package react

import kotlinext.js.jsObject

external interface SuspenseConfig {
    var timeoutMs: Int
}

fun SuspenseConfig(
    timeoutMs: Int,
): SuspenseConfig =
    jsObject {
        this.timeoutMs = timeoutMs
    }
