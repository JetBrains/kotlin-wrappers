package web.presentation

import js.promise.Promise
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationReceiver)
 */
@ExperimentalWebApi
open external class PresentationReceiver
private constructor() {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationReceiver/start)
     */

    val connectionList: Promise<PresentationConnectionList>
}
