package web.presentation

import js.promise.Promise

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationReceiver)
 */
open external class PresentationReceiver
private constructor() {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationReceiver/start)
     */

    val connectionList: Promise<PresentationConnectionList>
}
