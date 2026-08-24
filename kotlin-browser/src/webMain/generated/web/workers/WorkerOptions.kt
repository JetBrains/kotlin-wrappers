// Automatically generated - do not modify!

package web.workers

import kotlinx.js.JsPlainObject
import web.http.RequestCredentials

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/SharedWorker#options)
 */
@JsPlainObject
external interface WorkerOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/SharedWorker#credentials)
     */
    var credentials: RequestCredentials?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/SharedWorker#name)
     */
    var name: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/SharedWorker#type)
     */
    var type: WorkerType?
}
