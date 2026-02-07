package web.profiler

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface ProfilerTrace {
    val resources: ReadonlyArray<ProfilerResource>
    val frames: ReadonlyArray<ProfilerFrame>
    val stacks: ReadonlyArray<ProfilerStack>
    val samples: ReadonlyArray<ProfilerSample>
}
