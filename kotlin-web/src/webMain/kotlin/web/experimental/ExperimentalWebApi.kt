package web.experimental

import kotlin.RequiresOptIn.Level.ERROR
import kotlin.annotation.AnnotationTarget.*

@RequiresOptIn(level = ERROR)
@Retention(AnnotationRetention.BINARY)
@Target(
    CLASS,
    TYPEALIAS,
    PROPERTY,
    FIELD,
    FUNCTION,
)
annotation class ExperimentalWebApi
