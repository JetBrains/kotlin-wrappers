package web.presentation

import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Presentation)
 */
@ExperimentalWebApi
open external class Presentation
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Presentation/defaultRequest)
     */
    var defaultRequest: PresentationRequest?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Presentation/receiver)
     */
    val receiver: PresentationReceiver?
}
