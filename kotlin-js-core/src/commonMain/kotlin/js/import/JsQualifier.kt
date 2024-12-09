package js.import

@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.FILE)
expect annotation class JsQualifier(
    val value: String,
)
