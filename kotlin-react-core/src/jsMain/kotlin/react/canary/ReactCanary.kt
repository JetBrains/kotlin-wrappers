package react.canary

import kotlin.RequiresOptIn.Level.ERROR
import kotlin.annotation.AnnotationTarget.*

@RequiresOptIn(level = ERROR)
@Retention(AnnotationRetention.BINARY)
@Target(
    TYPEALIAS,
    PROPERTY,
    FIELD,
    FUNCTION,
)
annotation class ReactCanary
