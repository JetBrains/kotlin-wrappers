package react.raw

import js.promise.Promise
import js.void.Void

internal /* raw */
typealias TransitionFunctionRaw = () -> Promise<Void>?
