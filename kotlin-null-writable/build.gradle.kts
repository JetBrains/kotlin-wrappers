plugins {
    id("kotlin-library-conventions")
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinNode)
    commonMainApi(npm(libs.npm.nullWritable))
}
