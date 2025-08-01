@file:Suppress(
    "NO_ACTUAL_FOR_EXPECT",
)

package kotlin.js

import kotlin.annotation.AnnotationTarget.*

@Retention(AnnotationRetention.BINARY)
@Target(CLASS, PROPERTY, FUNCTION, FILE)
expect annotation class JsModule(
    val import: String,
)
