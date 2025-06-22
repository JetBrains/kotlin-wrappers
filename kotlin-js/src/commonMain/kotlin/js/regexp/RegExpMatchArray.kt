package js.regexp

import js.array.ArrayLike
import js.array.ReadonlyArray
import js.core.JsString
import js.objects.ReadonlyRecord
import js.reflect.JsExternalInheritorsOnly
import js.reflect.unsafeCast

@JsExternalInheritorsOnly
external interface RegExpMatchArray :
    ArrayLike<JsString> {
    /**
     * The index of the search at which the result was found.
     */
    val index: Int?

    /**
     * A copy of the search string.
     */
    val input: String?

    val groups: ReadonlyRecord<JsString, JsString>?

    val indices: RegExpIndicesArray?
}

inline fun RegExpMatchArray.asArray(): ReadonlyArray<JsString> =
    unsafeCast(this)
