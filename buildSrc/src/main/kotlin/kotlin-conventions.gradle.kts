import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

plugins.withType<KotlinJsPluginWrapper> {
    extensions.configure<KotlinJsProjectExtension> {
        js {
            moduleName = project.name
            browser()
        }
    }

    tasks.withType<KotlinJsCompile>().configureEach {
        kotlinOptions {
            sourceMap = false
        }
    }
}
