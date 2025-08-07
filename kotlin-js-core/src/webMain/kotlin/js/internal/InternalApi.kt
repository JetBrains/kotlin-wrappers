package js.internal

import kotlin.RequiresOptIn.Level.ERROR
import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.FUNCTION

@RequiresOptIn(level = ERROR)
@Retention(AnnotationRetention.BINARY)
@Target(
    CLASS,
    FUNCTION,
)
annotation class InternalApi
