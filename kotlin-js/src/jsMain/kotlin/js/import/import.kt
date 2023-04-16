package js.import

import kotlin.js.Promise

external fun <T : Any> import(
    path: String,
): Promise<T>

external object import {
    object meta {
        val url: String
    }
}
