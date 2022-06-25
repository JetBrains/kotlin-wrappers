package kotlinx.js

import kotlin.js.Promise

external fun <T : Any> import(
    path: String,
): Promise<T>
