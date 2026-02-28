package tanstack.react.router.raw

import js.core.Void
import js.promise.Promise
import tanstack.router.core.NavigateOptions

internal /* raw */
typealias UseNavigateResultRaw = (
    options: NavigateOptions,
) -> Promise<Void>
