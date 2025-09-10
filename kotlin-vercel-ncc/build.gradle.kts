plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinNode)
    webMainApi(npm(jspkg.vercel.ncc))
}
