import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack
import org.jetbrains.kotlin.gradle.tasks.KotlinJsDce

subprojects {
    tasks {
        withType<KotlinJsDce>().configureEach {
            enabled = false
        }

        withType<KotlinWebpack>().configureEach {
            enabled = false
        }
    }
}
