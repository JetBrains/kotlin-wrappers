// Automatically generated - do not modify!

package web.workers

import web.http.RequestCredentials

sealed external interface WorkerOptions {
    var credentials: RequestCredentials?
    var name: String?
    var type: WorkerType?
}
