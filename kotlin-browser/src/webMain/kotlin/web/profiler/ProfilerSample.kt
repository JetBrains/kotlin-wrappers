package web.profiler

import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import web.time.DOMHighResTimeStamp

@JsPlainObject
@ExperimentalWebApi
external interface ProfilerSample {
    val timestamp: DOMHighResTimeStamp
    val stackId: UInt53?
}
