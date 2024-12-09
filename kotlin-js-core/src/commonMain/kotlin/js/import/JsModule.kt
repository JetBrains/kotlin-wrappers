package js.import

import kotlin.annotation.AnnotationTarget.*

@Retention(AnnotationRetention.BINARY)
@Target(CLASS, PROPERTY, FUNCTION, FILE)
expect annotation class JsModule(
    val import: String,
)
