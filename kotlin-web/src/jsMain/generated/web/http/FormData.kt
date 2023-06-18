// Automatically generated - do not modify!

package web.http

import js.collections.MapLike
import js.core.JsIterable
import js.core.JsTuple2
import js.core.ReadonlyArray
import web.buffer.Blob
import web.events.EventTarget

external class FormData(
    form: EventTarget /* HTMLFormElement */ = definedExternally,
    submitter: EventTarget /* HTMLElement */? = definedExternally,
) : MapLike<String, FormDataEntryValue> {
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

    override fun entries(): JsIterable.Iterator<JsTuple2<String, FormDataEntryValue>>
    override fun keys(): JsIterable.Iterator<String>
    override fun values(): JsIterable.Iterator<FormDataEntryValue>
    override fun forEach(action: (value: FormDataEntryValue, key: String) -> Unit)
}
