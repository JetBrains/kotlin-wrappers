// Automatically generated - do not modify!

package web.http

import kotlinx.js.ReadonlyArray
import web.buffer.Blob
import web.events.EventTarget

external class FormData(
    form: EventTarget /* HTMLFormElement */ = definedExternally,
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
    fun get(name: String): FormDataEntryValue?
    fun getAll(name: String): ReadonlyArray<FormDataEntryValue>
    fun has(name: String): Boolean
    fun set(
        name: String,
        value: String,
        fileName: String = definedExternally,
    )

    fun set(
        name: String,
        value: Blob,
        fileName: String = definedExternally,
    )

    fun forEach(action: (item: FormDataEntryValue) -> Unit)
}
