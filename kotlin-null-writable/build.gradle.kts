plugins {
    id("wrappersbuild.kotlin-library-conventions")
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinNode)
    commonMainApi(npm(jspkg.nullWritable))
}
