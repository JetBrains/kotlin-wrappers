package js.promise

import js.core.Void

inline fun kotlin.js.Promise.Companion.resolve(): LegacyPromise<Void> =
    resolve(undefined)
