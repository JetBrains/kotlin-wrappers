import org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile

plugins {
    id("wrappersbuild.kotlin-conventions")
    id("wrappersbuild.publish-conventions")
    id("wrappersbuild.dokka-conventions")
}

tasks.withType<KotlinJvmCompile>().configureEach {
    compilerOptions {
        jvmTarget = JVM_11
    }
}
