package react

import kotlinext.js.jso

external interface SuspenseConfig {
    var timeoutMs: Int
}

fun SuspenseConfig(
    timeoutMs: Int,
): SuspenseConfig =
    jso {
        this.timeoutMs = timeoutMs
    }
