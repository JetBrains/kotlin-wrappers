package tanstack.router.core

import js.promise.Promise
import js.void.Void

// TODO: use `SuspendInvoker`?
typealias UseNavigateResult = Invoker<NavigateOptions, Promise<Void>>
