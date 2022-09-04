// Automatically generated - do not modify!

package webrtc

sealed external interface RTCStatsReport {
    fun forEach(
        callbackfn: (
            value: Any,
            key: String,
            parent: RTCStatsReport,
        ) -> Unit,
        thisArg: Any = definedExternally,
    )
}
