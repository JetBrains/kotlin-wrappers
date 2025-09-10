plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinNode)
    webMainApi(npm(jspkg.nullWritable))
}
