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
    implementation("com.github.node-gradle:gradle-node-plugin:${property("node_plugin_version")}")
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:${property("bintray_plugin_version")}")
}
