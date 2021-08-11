import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

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

    tasks.withType<KotlinJsCompile>().configureEach {
        kotlinOptions {
            sourceMap = false
        }
    }
}
