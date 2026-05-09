@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

external interface ObjectLike :
    Record<PropertyKey, JsAny?> {

    operator fun get(
        key: String,
    ): JsAny? = definedExternally

    operator fun set(
        key: String,
        value: JsAny?,
    ): Unit = definedExternally
}
