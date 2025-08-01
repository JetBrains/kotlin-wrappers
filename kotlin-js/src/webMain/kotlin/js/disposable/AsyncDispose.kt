package js.disposable

import js.core.Void
import js.promise.PromiseLike

typealias AsyncDispose = () -> PromiseLike<Void>
