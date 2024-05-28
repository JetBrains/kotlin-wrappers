val JS_PLAIN_OBJECT_BODY = """
package js.objects

typealias JsPlainObject = kotlinx.js.JsPlainObject
""".trimIndent()

val k2patch by tasks.registering {
    doLast {
        patchFile("gradle.properties") {
            it.replace(
                "kotlin.version=1.9.24",
                "kotlin.version=2.0.0",
            )
        }

        patchFile("kotlin-js/src/jsMain/kotlin/js/objects/JsPlainObject.kt") {
            JS_PLAIN_OBJECT_BODY
        }
    }
}

fun patchFile(
    path: String,
    transform: (String) -> String,
) {
    val file = rootProject.file(path)
    val content = file.readText()
    file.writeText(transform(content))
}
