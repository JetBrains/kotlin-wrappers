// Automatically generated - do not modify!

package electron.core

sealed external interface DetailsReason {
    companion object
}

inline val DetailsReason.Companion.cleanExit: DetailsReason
    get() = js.reflect.unsafeCast("clean-exit")

inline val DetailsReason.Companion.abnormalExit: DetailsReason
    get() = js.reflect.unsafeCast("abnormal-exit")

inline val DetailsReason.Companion.killed: DetailsReason
    get() = js.reflect.unsafeCast("killed")

inline val DetailsReason.Companion.crashed: DetailsReason
    get() = js.reflect.unsafeCast("crashed")

inline val DetailsReason.Companion.oom: DetailsReason
    get() = js.reflect.unsafeCast("oom")

inline val DetailsReason.Companion.launchFailed: DetailsReason
    get() = js.reflect.unsafeCast("launch-failed")

inline val DetailsReason.Companion.integrityFailure: DetailsReason
    get() = js.reflect.unsafeCast("integrity-failure")
