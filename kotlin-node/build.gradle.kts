import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper

plugins {
    `kotlin-library-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(kotlinxCoroutines("core"))

    jsMainApi(devNpmv("@types/node"))
}

plugins.withType<KotlinMultiplatformPluginWrapper> {
    extensions.configure<KotlinMultiplatformExtension> {
        val generatedLegacyDir = projectDir.resolve("src/jsMain/generatedLegacy")
        if (generatedLegacyDir.exists()) {
            sourceSets["jsMain"].kotlin.srcDir(generatedLegacyDir)
        }
    }
}
