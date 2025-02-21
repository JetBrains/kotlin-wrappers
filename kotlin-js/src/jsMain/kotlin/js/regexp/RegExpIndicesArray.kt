package js.regexp

import js.array.ArrayLike
import js.objects.ReadonlyRecord

@JsExternalInheritorsOnly
external interface RegExpIndicesArray :
    ArrayLike<RegExpIndex> {
    val groups: ReadonlyRecord<String, RegExpIndex>?
}
