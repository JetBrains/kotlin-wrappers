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
external interface RegExpIndicesArray :
    ArrayLike<RegExpIndex> {
    val groups: ReadonlyRecord<String, RegExpIndex>?

    @JsAlias(THIS)
    fun asArray(): ReadonlyArray<String>
}
