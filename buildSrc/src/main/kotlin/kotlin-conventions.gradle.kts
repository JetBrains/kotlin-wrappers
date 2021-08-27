import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper


tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions {
        allWarningsAsErrors = true
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        sourceMap = false
        sourceMapEmbedSources = null
        sourceMapPrefix = null
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
