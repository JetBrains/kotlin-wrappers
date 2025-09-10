package js.regexp

import js.array.ArrayLike
import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import js.reflect.JsExternalInheritorsOnly
import js.reflect.unsafeCast
import kotlin.js.JsString

@JsExternalInheritorsOnly
external interface RegExpIndicesArray :
    ArrayLike<RegExpIndex> {
    val groups: ReadonlyRecord<JsString, RegExpIndex>?
}

inline fun RegExpIndicesArray.asArray(): ReadonlyArray<JsString> =
    unsafeCast(this)
