// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.key

// language=JavaScript
@JsName("""(/*union*/{expired: 'expired', internalError: 'internal-error', outputDownscaled: 'output-downscaled', outputRestricted: 'output-restricted', released: 'released', statusPending: 'status-pending', usable: 'usable', usableInFuture: 'usable-in-future'}/*union*/)""")
sealed external interface MediaKeyStatus {
    companion object {
        val expired: MediaKeyStatus
        val internalError: MediaKeyStatus
        val outputDownscaled: MediaKeyStatus
        val outputRestricted: MediaKeyStatus
        val released: MediaKeyStatus
        val statusPending: MediaKeyStatus
        val usable: MediaKeyStatus
        val usableInFuture: MediaKeyStatus
    }
}
