package web.profiler

import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface ProfilerStack {
    val parentId: UInt53?
    val frameId: UInt53
}
