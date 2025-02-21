package js.regexp

import js.array.ArrayLike
import js.objects.ReadonlyRecord

@JsExternalInheritorsOnly
external interface RegExpExecArray :
    ArrayLike<String> {
    /**
     * The index of the search at which the result was found.
     */
    val index: Int

    /**
     * A copy of the search string.
     */
    val input: String

    val groups: ReadonlyRecord<String, String>?

    val indices: RegExpIndicesArray?
}
