package kotlinx.js

/**
 * Full copy of original `JsPlainObject`
 * Without this declaration compilation doesn't work as required
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
actual annotation class JsPlainObject
