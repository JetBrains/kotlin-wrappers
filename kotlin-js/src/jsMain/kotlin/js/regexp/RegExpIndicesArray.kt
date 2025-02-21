package js.regexp

import js.array.ArrayLike
import js.array.JsTuple2
import js.objects.ReadonlyRecord

@JsExternalInheritorsOnly
external interface RegExpIndicesArray :
    ArrayLike<JsTuple2<Int, Int>> {
    val groups: ReadonlyRecord<String, JsTuple2<Int, Int>>?
}
