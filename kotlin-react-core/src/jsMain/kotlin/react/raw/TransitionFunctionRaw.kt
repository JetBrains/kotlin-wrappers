package react.raw

import js.core.Void
import js.promise.Promise

typealias TransitionFunctionRaw = () -> Promise<Void>?
