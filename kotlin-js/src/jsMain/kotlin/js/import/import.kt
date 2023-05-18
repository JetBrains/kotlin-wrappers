package js.import

import js.promise.PromiseLike

external fun <T : Any> import(
    path: String,
): PromiseLike<T>

external object import {
    val meta: ImportMeta
}
