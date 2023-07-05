// Automatically generated - do not modify!

package web.http

import js.collections.MapLike
import js.core.IterableIterator
import js.core.JsTuple2
import js.core.ReadonlyArray
import web.buffer.Blob
import web.events.EventTarget

/**
 * Provides a way to easily construct a set of key/value pairs representing form fields and their values, which can then be easily sent using the XMLHttpRequest.send() method. It uses the same format a form would use if the encoding type were set to "multipart/form-data".
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData)
 */
external class FormData(
    form: EventTarget /* HTMLFormElement */ = definedExternally,
    submitter: EventTarget /* HTMLElement */? = definedExternally,
) : MapLike<String, FormDataEntryValue> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append) */
    fun append(
        name: String,
        value: String,
    )

    fun append(
        name: String,
        value: Blob,
    )

    fun append(
        name: String,
        blobValue: Blob,
        filename: String = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/delete) */
    fun delete(name: String)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/get) */
    operator fun get(name: String): FormDataEntryValue?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/getAll) */
    fun getAll(name: String): ReadonlyArray<FormDataEntryValue>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/has) */
    fun has(name: String): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set) */
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
        blobValue: Blob,
        filename: String = definedExternally,
    )

    override fun entries(): IterableIterator<JsTuple2<String, FormDataEntryValue>>
    override fun keys(): IterableIterator<String>
    override fun values(): IterableIterator<FormDataEntryValue>
    override fun forEach(action: (value: FormDataEntryValue, key: String) -> Unit)
}
