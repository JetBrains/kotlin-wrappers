package tanstack.router.core

import js.core.Void
import js.promise.Promise

// TODO: use `SuspendInvoker`?
typealias UseNavigateResult = Invoker<NavigateOptions, Promise<Void>>
