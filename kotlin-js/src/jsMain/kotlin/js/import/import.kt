package js.import

import kotlin.js.Promise

external fun <T : Any> import(
    path: String,
): Promise<T>

external object import {
    val meta: ImportMeta
}
