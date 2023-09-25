import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper

plugins {
    id("npm-conventions")
}

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions {
        allWarningsAsErrors = true

        freeCompilerArgs += listOf(
            "-opt-in=kotlin.ExperimentalStdlibApi",
            "-opt-in=kotlin.ExperimentalUnsignedTypes",
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

plugins.withType<KotlinMultiplatformPluginWrapper> {
    extensions.configure<KotlinMultiplatformExtension> {
        js {
            moduleName = project.name
            browser()
        }

        val generatedDir = projectDir.resolve("src/jsMain/generated")
        if (generatedDir.exists()) {
            sourceSets["jsMain"].kotlin.srcDir(generatedDir)
        }
    }
}
