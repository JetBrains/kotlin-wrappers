package kotlinx.js

import kotlin.js.Promise

external fun <T : Any> import(
    path: String,
): Promise<T>

external object import {
    object meta {
        object env

        val url: String
    }
}

inline val import.meta.env.MODE: String?
    get() = process.env.NODE_ENV

inline val import.meta.env.PROD: Boolean
    get() = process.env.NODE_ENV === "production"

inline val import.meta.env.DEV: Boolean
    get() = process.env.NODE_ENV !== "production"

@PublishedApi
internal external val process: dynamic
