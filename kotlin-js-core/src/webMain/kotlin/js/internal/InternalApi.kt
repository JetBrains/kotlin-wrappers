package js.internal

import kotlin.RequiresOptIn.Level.ERROR
import kotlin.annotation.AnnotationTarget.*

@RequiresOptIn(level = ERROR)
@Retention(AnnotationRetention.BINARY)
@Target(
    CLASS,
    PROPERTY,
    FUNCTION,
)
annotation class InternalApi
