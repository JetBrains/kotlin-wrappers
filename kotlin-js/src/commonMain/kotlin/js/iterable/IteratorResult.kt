package js.iterable

import js.core.JsAny
import js.core.JsAnyMarker

sealed external interface IteratorResult<out T : JsAny?, out TReturn : JsAny?> :
    JsAnyMarker
