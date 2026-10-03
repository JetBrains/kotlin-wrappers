package web.errors

import js.internal.InternalApi
import kotlin.reflect.KClass

@InternalApi
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
@Repeatable
annotation class JsThrows(
    val klass: KClass<out DOMExceptionType>,
) {
    @Target(AnnotationTarget.FUNCTION)
    @Retention(AnnotationRetention.BINARY)
    annotation class Typed(
        val klass: KClass<out DOMException>,
    )
}
