@file:Suppress(
    "UPPER_BOUND_VIOLATED",
)

package js.regexp

import js.array.ArrayLike
import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import js.reflect.JsExternalInheritorsOnly
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS

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

    @JsAlias(THIS)
    fun asArray(): ReadonlyArray<String>
}
