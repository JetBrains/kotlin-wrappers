package web.profiler

import js.promise.Promise
import js.promise.await
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import web.time.DOMHighResTimeStamp
import kotlin.js.JsName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Profiler)
 */
@ExperimentalWebApi
external class Profiler(
    options: ProfilerInitOptions,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Profiler/sampleInterval)
     */
    val sampleInterval: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Profiler/stopped)
     */
    val stopped: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Profiler/stop)
     */
    @JsName("stop")
    fun stopAsync(): Promise<ProfilerTrace>
}

@ExperimentalWebApi
suspend inline fun Profiler.stop(): ProfilerTrace =
    stopAsync().await()
