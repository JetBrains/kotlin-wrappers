plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinNode)
    commonMainApi(npm(jspkg.nullWritable))
}
