// Automatically generated - do not modify!

package web.performance

import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/measure#startormeasureoptions)
 */
@JsPlainObject
external interface PerformanceMeasureOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/measure#detail)
     */
    var detail: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/measure#duration)
     */
    var duration: DOMHighResTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/measure#end)
     */
    var end: DOMHighResTimeStamp /* | String */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/measure#start)
     */
    var start: DOMHighResTimeStamp /* | String */?
}
