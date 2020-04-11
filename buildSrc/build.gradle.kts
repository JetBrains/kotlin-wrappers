plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
    implementation("com.github.node-gradle:gradle-node-plugin:${property("node-plugin.version")}")
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:${property("bintray-plugin.version")}")
}
