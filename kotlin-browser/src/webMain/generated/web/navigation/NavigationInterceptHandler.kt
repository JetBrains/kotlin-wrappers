package web.navigation

import js.core.Void
import js.promise.Promise

typealias NavigationInterceptHandler = () -> Promise<Void>
