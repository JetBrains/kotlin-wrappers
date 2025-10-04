package web.launch

import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LaunchQueue)
 */
@ExperimentalWebApi
open external class LaunchQueue
private constructor() {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LaunchQueue/setConsumer)
     */
    fun setConsumer(consumer: LaunchConsumer)
}
