package web.timers

import js.core.DOMHighResTimeStamp

typealias FrameRequestCallback = (
    time: DOMHighResTimeStamp,
) -> Unit
