package web.errors

import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
@Repeatable
annotation class JsThrows(
    val klass: KClass<out DOMExceptionType>,
)
