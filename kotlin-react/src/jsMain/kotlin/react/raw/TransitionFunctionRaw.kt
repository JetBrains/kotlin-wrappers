package react.raw

import js.core.Void
import js.promise.Promise

internal /* raw */
typealias TransitionFunctionRaw = () -> Promise<Void>?
