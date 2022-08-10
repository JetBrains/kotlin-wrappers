package kotlinx.js

import kotlin.js.Promise

inline fun Promise.Companion.resolve(): Promise<Void> =
    resolve(undefined)
