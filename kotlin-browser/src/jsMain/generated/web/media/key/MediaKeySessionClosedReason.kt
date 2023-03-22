// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.key

// language=JavaScript
@JsName("""(/*union*/{closedByApplication: 'closed-by-application', hardwareContextReset: 'hardware-context-reset', internalError: 'internal-error', releaseAcknowledged: 'release-acknowledged', resourceEvicted: 'resource-evicted'}/*union*/)""")
sealed external interface MediaKeySessionClosedReason {
    companion object {
        val closedByApplication: MediaKeySessionClosedReason
        val hardwareContextReset: MediaKeySessionClosedReason
        val internalError: MediaKeySessionClosedReason
        val releaseAcknowledged: MediaKeySessionClosedReason
        val resourceEvicted: MediaKeySessionClosedReason
    }
}
