// Automatically generated - do not modify!

package web.workers

import js.objects.JsPlainObject
import web.http.RequestCredentials

@JsPlainObject
sealed external interface WorkerOptions {
    var credentials: RequestCredentials?
    var name: String?
    var type: WorkerType?
}
