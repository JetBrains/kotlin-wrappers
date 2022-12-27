// Automatically generated - do not modify!

package web.serviceworker

import web.workers.WorkerType

sealed external interface RegistrationOptions {
    var scope: String?
    var type: WorkerType?
    var updateViaCache: ServiceWorkerUpdateViaCache?
}
