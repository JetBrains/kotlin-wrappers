// Automatically generated - do not modify!

package web.form

import js.array.ReadonlyArray
import js.array.Tuple2
import js.collections.MapLike
import js.iterable.JsIterator
import web.blob.Blob
import web.events.EventTarget
import web.http.BodyInit
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`FormData`** interface provides a way to construct a set of key/value pairs representing form fields and their values, which can be sent using the fetch(), XMLHttpRequest.send() or navigator.sendBeacon() methods. It uses the same format a form would use if the encoding type were set to "multipart/form-data".
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData)
 */
open external class FormData(
    form: EventTarget /* HTMLFormElement */ = definedExternally,
    submitter: EventTarget /* HTMLElement */? = definedExternally,
) : MapLike<JsString, FormDataEntryValue>,
    BodyInit {
    /**
     * The **`append()`** method of the FormData interface appends a new value onto an existing key inside a FormData object, or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     */
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

    /**
     * The **`delete()`** method of the FormData interface deletes a key and its value(s) from a FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/delete)
     */
    fun delete(name: String)

    /**
     * The **`get()`** method of the FormData interface returns the first value associated with a given key from within a FormData object. If you expect multiple values and want all of them, use the getAll() method instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/get)
     */
    fun get(name: String): FormDataEntryValue?

    /**
     * The **`getAll()`** method of the FormData interface returns all the values associated with a given key from within a FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/getAll)
     */
    fun getAll(name: String): ReadonlyArray<FormDataEntryValue>

    /**
     * The **`has()`** method of the FormData interface returns whether a FormData object contains a certain key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/has)
     */
    fun has(name: String): Boolean

    /**
     * The **`set()`** method of the FormData interface sets a new value for an existing key inside a FormData object, or adds the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     */
    fun set(
        name: String,
        value: String,
    )

    fun set(
        name: String,
        value: Blob,
    )

    fun set(
        name: String,
        blobValue: Blob,
        filename: String = definedExternally,
    )

    override fun entries(): JsIterator<Tuple2<JsString, FormDataEntryValue>>
    override fun keys(): JsIterator<JsString>
    override fun values(): JsIterator<FormDataEntryValue>
    override fun forEach(action: (value: FormDataEntryValue, key: JsString) -> Unit)
}
