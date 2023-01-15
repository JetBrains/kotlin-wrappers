import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions {
        allWarningsAsErrors = true

        freeCompilerArgs += listOf(
            "-opt-in=kotlin.contracts.ExperimentalContracts",
        )
    }
}

val moduleDefinition = if (findProperty("modular") == "true") "commonjs" else "umd"

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        sourceMap = false
        sourceMapEmbedSources = null
        sourceMapPrefix = null
        moduleKind = moduleDefinition
    }
}

plugins.withType<KotlinJsPluginWrapper> {
    extensions.configure<KotlinJsProjectExtension> {
        js {
            moduleName = project.name
            browser()
        }

        val generatedDir = projectDir.resolve("src/main/generated")
        if (generatedDir.exists()) {
            sourceSets["main"].kotlin.srcDir(generatedDir)
        }
    }
}
