// Automatically generated - do not modify!

package web.serviceworker

import kotlinx.js.JsPlainObject
import web.workers.WorkerType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register#options)
 */
@JsPlainObject
external interface RegistrationOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register#scope)
     */
    var scope: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register#type)
     */
    var type: WorkerType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register#updateViaCache)
     */
    var updateViaCache: ServiceWorkerUpdateViaCache?
}
