package js.promise

import js.core.Void
import kotlin.js.Promise

inline fun Promise.Companion.resolve(): Promise<Void> =
    resolve(undefined)
