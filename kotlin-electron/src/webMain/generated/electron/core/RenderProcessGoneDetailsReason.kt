// Automatically generated - do not modify!

package electron.core

sealed external interface RenderProcessGoneDetailsReason {
    companion object
}

inline val RenderProcessGoneDetailsReason.Companion.cleanExit: RenderProcessGoneDetailsReason
    get() = js.reflect.unsafeCast("clean-exit")

inline val RenderProcessGoneDetailsReason.Companion.abnormalExit: RenderProcessGoneDetailsReason
    get() = js.reflect.unsafeCast("abnormal-exit")

inline val RenderProcessGoneDetailsReason.Companion.killed: RenderProcessGoneDetailsReason
    get() = js.reflect.unsafeCast("killed")

inline val RenderProcessGoneDetailsReason.Companion.crashed: RenderProcessGoneDetailsReason
    get() = js.reflect.unsafeCast("crashed")

inline val RenderProcessGoneDetailsReason.Companion.oom: RenderProcessGoneDetailsReason
    get() = js.reflect.unsafeCast("oom")

inline val RenderProcessGoneDetailsReason.Companion.launchFailed: RenderProcessGoneDetailsReason
    get() = js.reflect.unsafeCast("launch-failed")

inline val RenderProcessGoneDetailsReason.Companion.integrityFailure: RenderProcessGoneDetailsReason
    get() = js.reflect.unsafeCast("integrity-failure")

inline val RenderProcessGoneDetailsReason.Companion.memoryEviction: RenderProcessGoneDetailsReason
    get() = js.reflect.unsafeCast("memory-eviction")
