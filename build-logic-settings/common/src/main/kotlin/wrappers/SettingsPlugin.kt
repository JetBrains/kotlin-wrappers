package wrappers

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

class SettingsPlugin : Plugin<Settings> {
    override fun apply(target: Settings): Unit = with(target) {
        dependencyResolutionManagement {
            repositories {
                mavenCentral()
            }
        }
    }
}
