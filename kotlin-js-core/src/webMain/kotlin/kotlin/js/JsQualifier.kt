@file:Suppress(
    "NO_ACTUAL_FOR_EXPECT",
)

package kotlin.js

@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.FILE)
expect annotation class JsQualifier(
    val value: String,
)
