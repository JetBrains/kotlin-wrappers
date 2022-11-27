package js.promise

import kotlinx.js.Void
import kotlin.js.Promise

inline fun Promise.Companion.resolve(): Promise<Void> =
    resolve(undefined)
