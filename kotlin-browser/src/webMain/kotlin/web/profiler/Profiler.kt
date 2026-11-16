package web.profiler

import js.promise.Promise
import js.promise.await
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Profiler)
 */
@ExperimentalWebApi
open external class Profiler(
    options: ProfilerInitOptions,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Profiler/sampleInterval)
     */
    open val sampleInterval: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Profiler/stopped)
     */
    open val stopped: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Profiler/stop)
     */
    @JsName("stop")
    open fun stopAsync(): Promise<ProfilerTrace>
}

@ExperimentalWebApi
suspend inline fun Profiler.stop(): ProfilerTrace =
    stopAsync().await()
