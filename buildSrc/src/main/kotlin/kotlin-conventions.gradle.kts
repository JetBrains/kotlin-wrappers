import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper

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

plugins.withType<KotlinMultiplatformPluginWrapper> {
    extensions.configure<KotlinMultiplatformExtension> {
        js {
            moduleName = project.name
            browser()
        }

        val generatedDir = projectDir.resolve("src/jsMain/generated")
        if (generatedDir.exists()) {
            sourceSets["main"].kotlin.srcDir(generatedDir)
        }
    }
}

plugins.withType<KotlinJsPluginWrapper> {
    extensions.configure<KotlinJsProjectExtension> {
        js {
            moduleName = project.name
            browser()
        }

        val kotlinDir = projectDir.resolve("src/jsMain/kotlin")
        sourceSets["main"].kotlin.srcDir(kotlinDir)

        val generatedDir = projectDir.resolve("src/jsMain/generated")
        if (generatedDir.exists()) {
            sourceSets["main"].kotlin.srcDir(generatedDir)
        }

        val testDir = projectDir.resolve("src/jsTest/kotlin")
        if (testDir.exists()) {
            sourceSets["test"].kotlin.srcDir(testDir)
        }
    }
}
