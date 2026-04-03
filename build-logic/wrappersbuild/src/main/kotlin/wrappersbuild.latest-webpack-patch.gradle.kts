import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

tasks.withType<Kotlin2JsCompile>().configureEach {
    doLast {
        if (!name.startsWith("compileTest"))
            return@doLast

        if (!name.endsWith("WasmJs"))
            return@doLast

        this as Kotlin2JsCompile

        val files = fileTree(destinationDirectory) {
            include("*.mjs")
        }

        for (file in files) {
            val content = file.readText()
            val newContent = withImportMetaPatch(content)

            if (newContent != content) {
                file.writeText(newContent)
            }
        }
    }
}

fun withImportMetaPatch(
    content: String,
): String =
    content
        .replace(
            // language=javascript
            """
            |    const importMeta = import.meta;
            |    require = module.default.createRequire(importMeta.url);
            """.trimMargin(),
            // language=javascript
            """
            |    require = module.default.createRequire(import.meta.url);
            """.trimMargin(),
        )
        .replace(
            // language=javascript
            """
            |    const importMeta = import.meta;
            |    const require = module.default.createRequire(importMeta.url);
            """.trimMargin(),
            // language=javascript
            """
            |    const require = module.default.createRequire(import.meta.url);
            """.trimMargin(),
        )
        .replace(
            // language=javascript
            """
            |    const importMeta = import.meta;
            |    const filepath = importMeta.url.replace(
            """.trimMargin(),
            // language=javascript
            """
            |    const filepath = import.meta.url.replace(
            """.trimMargin(),
        )
