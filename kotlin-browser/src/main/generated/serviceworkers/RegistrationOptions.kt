// Automatically generated - do not modify!

package serviceworkers

import web.workers.WorkerType

sealed external interface RegistrationOptions {
    var scope: String?
    var type: WorkerType?
    var updateViaCache: ServiceWorkerUpdateViaCache?
}
