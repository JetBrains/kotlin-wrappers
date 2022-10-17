package web.workers

import web.http.RequestCredentials

external interface WorkerOptions {
    var credentials: RequestCredentials?
    var name: String?
    var type: WorkerType?
}
