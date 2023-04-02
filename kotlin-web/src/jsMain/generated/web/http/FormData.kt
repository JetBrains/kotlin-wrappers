// Automatically generated - do not modify!

package web.http

import js.core.ReadonlyArray
import web.buffer.Blob
import web.events.EventTarget

external class FormData(
    form: EventTarget /* HTMLFormElement */ = definedExternally,
    submitter: EventTarget /* HTMLElement */? = definedExternally,
) {
    fun append(
        name: String,
        value: String,
        fileName: String = definedExternally,
    )

    fun append(
        name: String,
        value: Blob,
        fileName: String = definedExternally,
    )

    fun delete(name: String)
    operator fun get(name: String): FormDataEntryValue?
    fun getAll(name: String): ReadonlyArray<FormDataEntryValue>
    fun has(name: String): Boolean
    operator fun set(
        name: String,
        value: String,
    )

    operator fun set(
        name: String,
        value: Blob,
    )

    fun set(
        name: String,
        value: Blob,
        fileName: String,
    )

    fun forEach(action: (item: FormDataEntryValue) -> Unit)
}
