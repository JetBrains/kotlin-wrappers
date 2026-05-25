plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinNode)
    webMainApi(npm(jspkg.vercel.ncc))
}
