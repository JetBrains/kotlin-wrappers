// Automatically generated - do not modify!

package web.serviceworker

import js.objects.JsPlainObject
import web.workers.WorkerType

@JsPlainObject
sealed external interface RegistrationOptions {
    var scope: String?
    var type: WorkerType?
    var updateViaCache: ServiceWorkerUpdateViaCache?
}
