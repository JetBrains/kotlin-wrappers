// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.streams

import js.core.Void
import kotlin.js.Promise

sealed external interface ReadableStreamGenericReader {
    val closed: Promise<Void>
        get() = definedExternally

    fun cancel(reason: Any? = definedExternally): Promise<Void> = definedExternally
}
